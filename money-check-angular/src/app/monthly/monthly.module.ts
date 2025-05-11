import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

import { MonthlyRoutingModule } from './monthly-routing.module';
import { MonthlyListComponent } from './pages/monthly-list/monthly-list.component';


@NgModule({
  declarations: [
    MonthlyListComponent
  ],
  imports: [
    CommonModule,
    MonthlyRoutingModule,
    HttpClientModule
  ]
})
export class MonthlyModule { }
