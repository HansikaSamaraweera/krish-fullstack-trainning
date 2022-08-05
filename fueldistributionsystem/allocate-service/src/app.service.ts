import { Inject, Injectable } from '@nestjs/common';
import { ClientKafka } from '@nestjs/microservices';
import { createSchedule } from './create-schedule';
import { ScheduleCreated } from './schedule-created';


@Injectable()
export class AppService {

  constructor(
    @Inject('ALLOCATE_SERVICE') private readonly billingClient: ClientKafka,
  ){}

  getHello(): string {
    return 'Hello World!';
  }

  createShed({id,type,amount}: createSchedule){
    this.billingClient.emit('allocate',new ScheduleCreated(id,type,amount));
    console.log(id,type,amount);
  }
}
