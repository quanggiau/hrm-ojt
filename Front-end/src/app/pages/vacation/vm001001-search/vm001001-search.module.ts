import { NgModule } from '@angular/core';
import { Vm001001SearchComponent } from './vm001001-search.component';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { TranslateModule } from '@ngx-translate/core';
import { BreabcrumbShareModule } from 'src/app/common/components/breadcrumb-share/breabcrumb-share.module';
import { ReactiveFormsModule } from '@angular/forms';
const routes: Routes = [{path: '', component: Vm001001SearchComponent}];
@NgModule({
    imports: [
        CommonModule,
        RouterModule.forChild(routes),
        NgbModule,
        // NgbPagination,
        BreabcrumbShareModule,
        TranslateModule,
        ReactiveFormsModule

    ],
    exports: [],
    declarations: [
        Vm001001SearchComponent,
    ],
    providers: [
    ],
})
export class VM001001SearchModule { }
