import { Inject, Injectable } from '@nestjs/common';
import { ClientKafka } from '@nestjs/microservices';
import { createSchedule } from './create-schedule';
import { ScheduleCreated } from './schedule-created';


@Injectable()
export class AppService {

  private available: number = 1000000;
  private ans: number;

  constructor(
    @Inject('ALLOCATE_SERVICE') private readonly billingClient: ClientKafka,
  ){}

  getHello(): string {
    return 'Hello World!';
  }

  createShed({id,type,amount,orderId}: createSchedule){

    if(this.available-amount>0){
      this.billingClient.emit('allocate',new ScheduleCreated(id,type,amount,orderId,true));
      console.log(id,type,amount);
      this.available = this.available-amount;
    }else{
      this.billingClient.emit('allocate',new ScheduleCreated(id,type,amount,orderId,false));
      console.log(id,type,amount);
    }
   
  }
}
