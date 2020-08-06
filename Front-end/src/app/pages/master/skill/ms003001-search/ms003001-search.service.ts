import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class MS003001SearchService {
  constructor(
    private http: HttpClient
  ) { }
  getSkill(Skill: {}): Observable<any> {
    // if ((sName !== '') || (sCode !== '')) {
    //   return this.http.post<any>(`${environment.apiUrl}/ms/ms003001searchskill`, {
    //     pageNum: pNum,
    //     pageSize: pSize,
    //     skillName: sName,
    //     skillCode: sCode,
    //     companyID : 1,
    //   });
    // }

    return this.http.post<any>(`${environment.apiUrl}/ms/ms003001searchskill`, Skill,
    ); }
}
