import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpErrorResponse } from '@angular/common/http';
// import { StoragesService } from '../storage/storage.service';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthInterceptorService implements HttpInterceptor {

  constructor(
    // private storageService :StoragesService
  ) { }
  intercept(req: HttpRequest<any>, next: HttpHandler) {
    // TODO : FEATUTES LOGIN CONTINUTE
    // tslint:disable-next-line:max-line-length
    const authToken = 'Bearer ' + 'eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJraGFuaCIsImlhdCI6MTU5NjY3OTk1MywiZXhwIjoxNTk2NzY2MzUzLCJyb2xlcyI6WyJBRE1JTiIsIk1FTUJFUiJdLCJjb21wYW55aWQiOjF9.ClCaIutlOdNvk4NixxvUGtU0Xxx_xAJ8v8Xy-Oe1M1aHId5wRJxjCCpAGTafhUqJj_ybZrVhJlQqvzRrJVmbWw';
    // Get the auth token from the service.
    // const authToken = this.storageService.getToken();
    // if(authToken){
    //   const authReq = req.clone({
    //     headers: req.headers.set('Authorization', authToken)
    //   });
    //   return next.handle(authReq);
    // }
    // Clone the request and replace the original headers with
    // cloned headers, updated with the authorization.
    const modified = req.clone({ headers: req.headers.set('Authorization', authToken)});
    // send cloned request with header to the next handler.
    return next.handle(modified)
    .pipe(
      catchError((error: HttpErrorResponse) => {
        let errorMsg = '';
        if (error.error instanceof ErrorEvent) {
          console.log('this is client side error');
          errorMsg = `Error: ${error.error.message}`;
        } else {
          console.log('this is server side error');
          errorMsg = `Error Code: ${error.status},  Message: ${error.message}`;
        }
        console.log(errorMsg);
        return throwError(errorMsg);
      })
    );
  }
}
