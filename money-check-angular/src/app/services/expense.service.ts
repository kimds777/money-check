import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ExpenseService {

  constructor(private http: HttpClient) { }

  // 지출리스트 조회 (ALL, 예산별, 기간별, 검색어별...)
  getExpensesList(req: Record<string, any>): Observable<any> {
    return this.http.post('http://localhost:8081/api/expenses/list', req);
  }
}
