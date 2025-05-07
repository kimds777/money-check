import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExpenseListComponent } from './pages/expense-list/expense-list.component';
import { ExpenseDetailComponent } from './pages/expense-detail/expense-detail.component';

const routes: Routes = [
  {path: 'expense/list', component: ExpenseListComponent}
  ,{path: 'expense/detail', component: ExpenseDetailComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ExpenseRoutingModule { }
