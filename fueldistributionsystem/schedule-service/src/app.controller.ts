import { Body, Controller, Get, Post } from '@nestjs/common';
import { AppService } from './app.service';
import { createSchedule } from './create-schedule';

@Controller('/sched')
export class AppController {
  constructor(private readonly appService: AppService) {}

  
  @Get()
  getHello(): string {
    return this.appService.getHello();
  }
  @Post('/adds')
  createSchedule(@Body() createSchedule: createSchedule){
    this.appService.createShed(createSchedule);
  }
}
