import { NgModule } from '@angular/core';
import { BreadcrumbShareComponent } from './breadcrumb-share.component';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
    
@NgModule({
    imports: [
        CommonModule,
        RouterModule       
    ],
    exports: [BreadcrumbShareComponent,CommonModule],
    declarations: [BreadcrumbShareComponent],
    providers: [BreadcrumbShareComponent],
})
export class BreabcrumbShareModule { }
