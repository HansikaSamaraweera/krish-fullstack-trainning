import { Injectable, OnModuleInit } from "@nestjs/common";
import { ConsumerService } from "./Consumer.service";

@Injectable()
export class GetData implements OnModuleInit{
    
    constructor(private readonly consumerService: ConsumerService){
    }
    
    async onModuleInit() {
        await this.consumerService.consume(
          { topic: 'fuel' },
          {
            eachMessage: async ({ topic, partition, message }) => {
              console.log({
                value: message.value.toString(),
                topic: topic.toString(),
                partition: partition.toString(),
              });
            },
          },
        );
      }

}