import { Component, OnInit } from '@angular/core';
import { ExpenseService } from '../../services/expense.service';

@Component({
  selector: 'app-expense-list',
  templateUrl: './expense-list.component.html',
  styleUrls: ['./expense-list.component.scss']
})
export class ExpenseListComponent implements OnInit {
  expenseList: Record<string, any>[] = [];
  expense: Record<string, any> = {};
  totalExpense: string = "";
  totalCount: string = "";

  constructor(private expenseService: ExpenseService) {}

  ngOnInit(): void {
    // 초기화 작업
    this.getExpensesList({"userId":1});
  }

    // 지출리스트 조회 (ALL, 예산별, 기간별, 검색어별...)
  getExpensesList(req: Record<string, any>): void {
    this.expenseService.getExpensesList(req).subscribe((res) => {
      console.log(res);
      this.expenseList = res.result;
      this.totalExpense = res.totalAmount;
      this.totalCount = res.totalCount;
      console.log(this.expenseList);
    });
  }
}
