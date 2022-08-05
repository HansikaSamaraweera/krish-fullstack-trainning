export class ScheduleCreated{
    constructor(
       
        public readonly id:string,
        public readonly type: string,
        public readonly amount: string
    ){}

    toString(){
        return JSON.stringify({
             
            id: this.id,
            type: this.type,
            amount: this.amount
        });
    }
}