import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({providedIn: 'root'})
export class VM001001SearchService {
    constructor(
        private http: HttpClient
    ) { }
    search() {
    }
}
