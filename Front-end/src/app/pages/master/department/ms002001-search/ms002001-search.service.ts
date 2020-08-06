import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class MS002001SearchService {
  constructor(
    private http: HttpClient
  ) { }
  getDepartment(pNum: any , pSize: any, dName: any): Observable<any> {
    // TODO
    if (dName !== '') {
      return this.http.post<any>(`${environment.apiUrl}/ms/ms002001searchdepartment`, {
        pageNum: pNum,
        pageSize: pSize,
        departmentName: dName,
        companyID: 1
      });
    }

    return this.http.post<any>(`${environment.apiUrl}/ms/ms002001searchdepartment`, {
      pageNum: pNum,
      pageSize: pSize,
      companyID : 1
    });

  }
}
