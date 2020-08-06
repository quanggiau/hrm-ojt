import { FormControl, FormGroup } from '@angular/forms';

export class DateValidator {
// "dd/mm/yyyy
    static ptDate(control: FormControl): { [key: string]: any } {
      const ptDatePattern = '^(((0[1-9]|[12]\d|3[01])\/(0[13578]|1[02])\/((19|[2-9]\d)\d{2}))|((0[1-9]|[12]\d|30)\/(0[1'
      + '3456789]|1[012])\/((19|[2-9]\d)\d{2}))|((0[1-9]|1\d|2[0-8])\/02\/((19|[2-9]\d)\d{2}))'
      + '|(29\/02\/((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$/g';
      if (!control.value) {
          return null;
        } else if (!control.value.match(ptDatePattern)) {
                     return { ptDate: true };
              }
      return null;
    }
    dateLessThan(from: string, to: string) {
        return (group: FormGroup): {[key: string]: any} => {
          const f = group.controls[from];
          const t = group.controls[to];
          if (f.value > t.value) {
            return {
              dates: true
            };
          }
          return {};
        };
    }
 }
