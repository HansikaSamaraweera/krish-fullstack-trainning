import { Inject, Injectable } from '@nestjs/common';
import { ClientKafka } from '@nestjs/microservices';
import { ScheduleCreated } from './schedule-created';
import { createSchedule } from './create-schedule';
import { DispatchModule } from './dispatch/dispatch.module';
import { dispatch, DispatchDocumernt } from './dispatch';
import { Model } from 'mongoose';
import { InjectModel } from '@nestjs/mongoose';
@Injectable()
export class AppService {
  constructor(
    @Inject('DISPATCH_SERVICE') private readonly billingClient: ClientKafka,@InjectModel(dispatch.name) private disModel: Model<DispatchDocumernt>
  ){}
  getHello(): string {
    return 'Hello World!';
  }

  handleScheduleCreated(scheduleCreated: ScheduleCreated){
    console.log(scheduleCreated);
  }
  
  createShed({id,type,amount,orderId,available,day}: createSchedule){
    const kkk = new this.disModel();
    kkk.id = id;
    kkk.type = type;
    kkk.amount = amount;
    kkk.orderId = orderId;
    kkk.available = available;
    kkk.day = day;
    this.create(kkk);

    this.billingClient.emit('order',new ScheduleCreated(id,type,amount,orderId,available,day));
    console.log(id,type,amount);
  }
  async create(dis: dispatch): Promise<dispatch> {
    const newBook = new this.disModel(dis);
    return newBook.save();
}

}
