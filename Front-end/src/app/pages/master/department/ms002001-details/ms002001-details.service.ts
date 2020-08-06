import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Department } from '../department-entity/department';

@Injectable({
  providedIn: 'root'
})

export class MS002001DetailService {
  constructor(
    private http: HttpClient
  ) { }

  createDepartment(body: Department): Observable<any> {
    return this.http.post<any>(`${environment.apiUrl}/ms/ms002002createdepartment`, body, {observe: 'response'}  );
  }

  updateDepartment(body: Department): Observable<any> {
    return this.http.put<any>(`${environment.apiUrl}/ms/ms002002updatedepartment`, body);
  }
  getDetailDepartment(id: any): Observable<any> {
    return this.http.post<any>(`${environment.apiUrl}/ms/ms002detailDepartment`, {
      deparmentID : id
    });
  }
}
