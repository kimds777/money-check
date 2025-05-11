import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const baseUrl = 'http://localhost:8081/api/income';

@Injectable({
  providedIn: 'root'
})
export class IncomeService {

  constructor(private http: HttpClient) { }

  // 수입리스트 조회 (ALL, 예산별, 기간별, 검색어별...)
  getIncomeList(req: Record<string, any>): Observable<any> {
    return this.http.post(`${baseUrl}/list`, req);
  }

}
