import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

import { ExpenseRoutingModule } from './expense-routing.module';
import { ExpenseListComponent } from './pages/expense-list/expense-list.component';
import { ExpenseDetailComponent } from './pages/expense-detail/expense-detail.component';


@NgModule({
  declarations: [
    ExpenseListComponent,
    ExpenseDetailComponent
  ],
  imports: [
    CommonModule,
    ExpenseRoutingModule,
    HttpClientModule
  ]
})
export class ExpenseModule { }
