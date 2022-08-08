export class ScheduleCreated{
    constructor(
     
        public readonly id:string,
        public readonly type: string,
        public readonly amount: number,
        public readonly orderId:string,
        public readonly available: boolean,
        public readonly day: string
 
    ){}

    toString(){
        return JSON.stringify({
           
            id: this.id,
            type: this.type,
            amount: this.amount,
            orderId: this.orderId,
            available: this.available,
            day: this.day
        });
    }
}