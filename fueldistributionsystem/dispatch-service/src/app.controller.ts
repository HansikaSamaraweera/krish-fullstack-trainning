import { Body, Controller, Get, OnModuleInit, Post } from '@nestjs/common';
import { EventPattern } from '@nestjs/microservices';
import { AppService } from './app.service';
import { createSchedule } from './create-schedule';


@Controller('dispa')
export class AppController {
  constructor(private readonly appService: AppService) {}
 

  @Get()
  getHello(): string {
    return this.appService.getHello();
  }

  @Post('/add')
  createSchedule(@Body() createSchedule: createSchedule){
    this.appService.createShed(createSchedule);
  }
}
