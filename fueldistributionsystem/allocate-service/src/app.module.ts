import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { AllocateModule } from './allocate/allocate.module';
import { ClientsModule,Transport} from '@nestjs/microservices';

@Module({
  imports: [AllocateModule, 
    ClientsModule.register([{
      name: 'ALLOCATE_SERVICE',
      transport: Transport.KAFKA,
      options:{
        client:{
          clientId:'orderid',
          brokers: ['localhost:9092']
        },
        consumer:{
          groupId: 'allo'
        }
      }
    }])
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
