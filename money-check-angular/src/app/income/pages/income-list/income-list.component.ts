import { Component, OnInit } from '@angular/core';
import { IncomeService } from '../../services/income.service';

@Component({
  selector: 'app-income-list',
  templateUrl: './income-list.component.html',
  styleUrls: ['./income-list.component.scss']
})
export class IncomeListComponent implements OnInit {
  incomeList: Record<string, any>[] = [];
  income: Record<string, any> = {};
  totalIncomeAmount: string = "";
  totalIncomeCount: string = "";

  constructor(private incomeService: IncomeService) {}

  ngOnInit(): void {
    this.getIncomeList({"userId":1});
  }

  getIncomeList(req: Record<string, any>): void {
    this.incomeService.getIncomeList(req).subscribe({
      next: (res) => {
        console.log(res);
        this.incomeList =  res.result;
        this.totalIncomeAmount = res.totalAmount;
        this.totalIncomeCount = res.totalCount;
        console.log(this.incomeList);
      },
      error: (e) => console.error(e)
    });
  }

}
