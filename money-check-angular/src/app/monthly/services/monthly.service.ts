import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const baseUrl = 'http://localhost:8081/api/monthly';

@Injectable({
  providedIn: 'root'
})
export class MonthlyService {

  constructor(private http: HttpClient) { }
  
}
