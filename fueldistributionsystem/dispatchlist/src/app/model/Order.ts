export class Order{
  id: string;
  type:string;
  amount:number;
  orderId: string;
  available:boolean;
  day: string;

  constructor(id: string, type: string, amount: number, orderId: string, available: boolean, day: string) {
    this.id = id;
    this.type = type;
    this.amount = amount;
    this.orderId = orderId;
    this.available = available;
    this.day = day;
  }
}
