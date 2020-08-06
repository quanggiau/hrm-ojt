import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { NgbPagination, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { BreabcrumbShareModule } from 'src/app/common/components/breadcrumb-share/breabcrumb-share.module';
import { MS003001SearchComponent } from './ms003001-search.component';


const routes: Routes = [
{
    path: '',
    component: MS003001SearchComponent,
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
        MS003001SearchComponent,
                ],
    providers: [],
})
export class VM003001SearchModule { }
