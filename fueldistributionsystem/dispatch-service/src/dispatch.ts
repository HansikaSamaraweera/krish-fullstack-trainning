import { Prop, Schema, SchemaFactory } from "@nestjs/mongoose";
import { Document } from "mongoose";

export type DispatchDocumernt = dispatch & Document;
@Schema()
export class dispatch {

    @Prop()
    id: string;

    @Prop()
    type: string;

    @Prop()
    amount: number;

    @Prop()
    orderId: string;

    @Prop()
    available: boolean;

    @Prop()
    day: string;
}
export const DispatchSchema = SchemaFactory.createForClass(dispatch);