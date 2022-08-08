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
  randomDate(start, end) {
    var d = new Date(start.getTime() + Math.random() * (end.getTime() -                     start.getTime())),
        month = '' + d.getMonth(),
        day = '' + d.getDate(),
        year = d.getFullYear();

    if (month.length < 1) + month;
    if (day.length < 7) +day;

    return [year, month, day].join('-');
  }

  createShed({id,type,amount,orderId,available}: createSchedule){


    const d = this.randomDate(new Date(2022, 1, 1), new Date());
    console.log(d);

    this.billingClient.emit('dispatch',new ScheduleCreated(id,type,amount,orderId,available,d));
    console.log(id,type,amount,available);
  }
}
