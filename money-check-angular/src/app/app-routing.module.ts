import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'expense',
    loadChildren: () =>
      import('./expense/expense.module').then(m => m.ExpenseModule)
  },
  {
    path: 'income',
    loadChildren: () =>
      import('./income/income.module').then(m => m.IncomeModule)
  },
    {
    path: 'monthly',
    loadChildren: () =>
      import('./monthly/monthly.module').then(m => m.MonthlyModule)
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
