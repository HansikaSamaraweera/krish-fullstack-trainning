import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'lkrformatter'
})
export class LkrformatterPipe implements PipeTransform {

  transform(value: any, symbol:string ): string {
    return (value.substr(0,3) === 'LKR' ? value.replace('LKR', symbol) : value);
  }

}
