import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MonthlyListComponent } from './pages/monthly-list/monthly-list.component';

const routes: Routes = [
  {path: 'monthly/list', component: MonthlyListComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MonthlyRoutingModule { }
