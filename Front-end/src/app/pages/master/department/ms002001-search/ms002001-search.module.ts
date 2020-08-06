import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
// import { DepartmentComponent } from './department.component';


import { NgbPagination, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { BreabcrumbShareModule } from 'src/app/common/components/breadcrumb-share/breabcrumb-share.module';
import { MS002001SearchComponent } from './ms002001-search.component';


const routes: Routes = [
{
    path: '',
    component: MS002001SearchComponent,
}
];
@NgModule({
    imports: [
        CommonModule,
        RouterModule.forChild(routes),
        NgbModule,
        FormsModule,
        ReactiveFormsModule,
        TranslateModule,
        BreabcrumbShareModule

    ],
    exports: [],
    declarations: [
        MS002001SearchComponent,
        // DepartmentDetailsComponent,
        // BreadcrumbShareComponent
                ],
    providers: [],
})
export class VM002001SearchModule { }
