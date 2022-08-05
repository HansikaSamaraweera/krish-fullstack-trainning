import { Module } from '@nestjs/common';
import { ClientsModule, Transport } from '@nestjs/microservices';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { DispatchModule } from './dispatch/dispatch.module';

@Module({
  imports: [DispatchModule,
    ClientsModule.register([{
    name: 'DISPATCH_SERVICE',
    transport: Transport.KAFKA,
    options:{
      client:{
        clientId:'orderid',
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
