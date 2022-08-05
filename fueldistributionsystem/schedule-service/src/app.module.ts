import { Module } from '@nestjs/common';
import { ClientsModule, Transport } from '@nestjs/microservices';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { ScheduleModule } from './schedule/schedule.module';

@Module({
  imports: [ScheduleModule,
    ClientsModule.register([{
      name: 'DISPATCH_SERVICE',
      transport: Transport.KAFKA,
      options:{
        client:{
          clientId:'disid',
          brokers: ['localhost:9092']
        },
        consumer:{
          groupId: 'dispatch'
        }
      }
    }]),
    
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
