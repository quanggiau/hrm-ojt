import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule, APP_INITIALIZER } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { SharedModule } from './theme/shared/shared.module';

import { AppComponent } from './app.component';


/* layout */
import { ThemeLayoutModule } from './theme/layout/theme-layout.module';

import { TranslateLoaderModule } from './services/translate/translate-loader/translate-loader.module';
import { Translate } from './services/translate/translate.service';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AuthInterceptorService } from './services/interceptor/interceptor-service';
import { NgbDateAdapter, NgbDateParserFormatter, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CustomAdapter, CustomDateParserFormatter } from './common/validator/NgbDateFRParserFormatter';



export function initLanguage(translateService: Translate) {
  return (): Promise<any> => translateService.initLanguage();
}
@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    NgbModule,

    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    SharedModule,
    ThemeLayoutModule,
    TranslateLoaderModule,
    HttpClientModule
  ],
  providers: [
    { provide: APP_INITIALIZER, useFactory: initLanguage, multi: true, deps: [Translate] },
    { provide: HTTP_INTERCEPTORS, useClass: AuthInterceptorService, multi: true },
    {provide: NgbDateAdapter, useClass: CustomAdapter},
    {provide: NgbDateParserFormatter, useClass: CustomDateParserFormatter}

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
