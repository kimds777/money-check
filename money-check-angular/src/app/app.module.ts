import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { LOCALE_ID } from '@angular/core';
import { registerLocaleData } from '@angular/common';
import localeKo from '@angular/common/locales/ko';  // 한국어 로케일 데이터 import

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ExpenseModule } from './expense/expense.module';
import { IncomeModule } from './income/income.module';
import { MonthlyModule } from './monthly/monthly.module';

// 한국어 로케일 데이터 등록
registerLocaleData(localeKo);

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ExpenseModule,
    IncomeModule,
    MonthlyModule
  ],
  providers: [
    { provide: LOCALE_ID, useValue: 'ko-KR' }  // 한국어 로케일 설정

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
