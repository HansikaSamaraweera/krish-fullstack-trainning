import { Inject, Injectable } from '@nestjs/common';
import { ClientKafka } from '@nestjs/microservices';
import { createSchedule } from './create-schedule';
import { ScheduleCreated } from './schedule-created';

@Injectable()
export class AppService {


constructor(
  @Inject('DISPATCH_SERVICE') private readonly billingClient: ClientKafka,
){}

  getHello(): string {
    return 'Hello World!';
  }

  createShed({id,type,amount}: createSchedule){
    this.billingClient.emit('dispatch',new ScheduleCreated(id,type,amount));
    console.log(id,type,amount);
  }
}
