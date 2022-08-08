import { Module } from '@nestjs/common';
import { ClientsModule, Transport } from '@nestjs/microservices';
import { MongooseModule } from '@nestjs/mongoose';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { dispatch, DispatchSchema } from './dispatch';
import { DispatchModule } from './dispatch/dispatch.module';

@Module({
  imports: [DispatchModule,
    MongooseModule.forRoot('mongodb+srv://doodlerwishes:Hansi99@cluster0.nv2zr.mongodb.net/customerDB?retryWrites=true&w=majority'),
    MongooseModule.forFeature([{ name : dispatch.name ,schema:DispatchSchema}]),
    ClientsModule.register([{
    name: 'DISPATCH_SERVICE',
    transport: Transport.KAFKA,
    options:{
      client:{
        clientId:'orderid',
        brokers: ['localhost:9092']
      },
      consumer:{
        groupId: 'orderid'
      }
    }
  }]),
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
