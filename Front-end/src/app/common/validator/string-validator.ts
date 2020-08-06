import { FormControl } from '@angular/forms';

export class StringValidator {
    static passwordValidator(control: FormControl): { [key: string]: any } {
        const passwordPattern = /^(?=[^A-Z]*[A-Z])(?=[^a-z]*[a-z])(?=\\D*\\d)[A-Za-z\\d!$%@#£€*?&]{8,}$/;
        if (!control.value.match(passwordPattern)) {
            return { password: true };
        }
        return null;
    }
    static emailValidator(control: FormControl): { [key: string]: any} {
        const emailPattern = '';
        if (!control.value.match(emailPattern)) {
            return { email: true };
        }
        return null;
    }
}







