import { Body, Controller, Get, Post } from '@nestjs/common';
import { ProducerService } from './allocate/Producer.service';
import { AppService } from './app.service';
import { createSchedule } from './create-schedule';


@Controller('cont')
export class AppController {
  constructor(private readonly appService: AppService, private readonly producerService:ProducerService) 
  {}

  @Get()
  getHello(): string {
    return this.appService.getHello();
  }
  @Post('/pot')
  createSchedule(@Body() createSchedule: createSchedule){
    this.appService.createShed(createSchedule);
  }
}
