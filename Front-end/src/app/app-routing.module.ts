import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './theme/layout/admin/admin.component';
import {AuthComponent} from './theme/layout/auth/auth.component';

const routes: Routes = [
  {
    path: '',
    component: AdminComponent,
    children: [
      {
        path: '',
        redirectTo: '',
        pathMatch: 'full'
      },
      {
        path: 'department',
        loadChildren: () => import('./pages/master/department/ms002001-search/ms002001-search.module').then(m => m.VM002001SearchModule)
      },
      {
        path: 'vacation',
        loadChildren: () => import('./pages/vacation/vm001001-search/vm001001-search.module').then(m => m.VM001001SearchModule)
      },
      {
        path: 'department/detail/:id',
        loadChildren: () => import('./pages/master/department/ms002001-details/ms002001-details.module').then(m => m.MS002001DetailsModule)
      },
      {
        path: 'department/create',
        loadChildren: () => import('./pages/master/department/ms002001-details/ms002001-details.module').then(m => m.MS002001DetailsModule)
      },
      {
        path: 'skill',
        loadChildren: () => import('./pages/master/skill/ms003001-search/ms003001-search.module').then(m => m.VM003001SearchModule)
      },
     ]
  },
  // {
  //   path: '',
  //   component: AuthComponent,
  //   children: [
  //     {
  //       path: 'auth',
  //       // loadChildren: () => import('./demo/pages/authentication/authentication.module').then(module => module.AuthenticationModule)
  //     }
  //   ]
  // },
  {
    path: '**',
    redirectTo: ''
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
