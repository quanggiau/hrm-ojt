import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TranslateModule } from '@ngx-translate/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BreabcrumbShareModule } from 'src/app/common/components/breadcrumb-share/breabcrumb-share.module';
import { Routes, RouterModule } from '@angular/router';
import { MS002001DetailsComponent } from './ms002001-details.component';
const routes: Routes = [
    {path: '', component: MS002001DetailsComponent}
];

@NgModule({
    imports: [
        CommonModule,
        RouterModule.forChild(routes),
        TranslateModule,
        FormsModule,
        ReactiveFormsModule,
        TranslateModule,
        BreabcrumbShareModule
    ],
    exports: [],
    declarations: [MS002001DetailsComponent],
    providers: [],
})
export class MS002001DetailsModule { }
