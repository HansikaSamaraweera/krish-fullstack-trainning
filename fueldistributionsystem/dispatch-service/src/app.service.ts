import { Inject, Injectable } from '@nestjs/common';
import { ClientKafka } from '@nestjs/microservices';
import { ScheduleCreated } from './schedule-created';
import { createSchedule } from './create-schedule';
@Injectable()
export class AppService {
  constructor(
    @Inject('DISPATCH_SERVICE') private readonly billingClient: ClientKafka,
  ){}
  getHello(): string {
    return 'Hello World!';
  }

  handleScheduleCreated(scheduleCreated: ScheduleCreated){
    console.log(scheduleCreated);
  }
  
  createShed({id,type,amount}: createSchedule){
    this.billingClient.emit('order',new ScheduleCreated(id,type,amount));
    console.log(id,type,amount);
  }

}
