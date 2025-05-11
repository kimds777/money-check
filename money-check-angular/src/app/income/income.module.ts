import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

import { IncomeRoutingModule } from './income-routing.module';
import { IncomeListComponent } from './pages/income-list/income-list.component';


@NgModule({
  declarations: [
    IncomeListComponent
  ],
  imports: [
    CommonModule,
    IncomeRoutingModule,
    HttpClientModule
  ]
})
export class IncomeModule { }
