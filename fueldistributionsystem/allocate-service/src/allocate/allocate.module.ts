import { Module } from '@nestjs/common';
import { ConsumerService } from './Consumer.service';
import { GetData } from './getData';
import { ProducerService } from './Producer.service';


@Module({
    providers: [ProducerService,ConsumerService,GetData],
    exports: [ProducerService,ConsumerService,GetData],
})
export class AllocateModule {}
