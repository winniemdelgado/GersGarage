import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { BookingComponent } from './booking/booking.component';
import { ServicesComponent } from './services/services.component';
import { NewBookingComponent } from './new-booking/new-booking.component';
import { RegisterComponent } from './register/register.component';

import { AllBookingsComponent } from './all-bookings/all-bookings.component';
import { ShopAdminComponent } from './shop-admin/shop-admin.component';
import { MechanicsComponent } from './mechanics/mechanics.component';
import { NewMechanicComponent } from './new-mechanic/new-mechanic.component';
import { NewServiceComponent } from './new-service/new-service.component';

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'booking',
    component: BookingComponent
  },
  {
    path: 'services',
    component: ServicesComponent
  },
  {
    path: 'new-booking',
    component: NewBookingComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'all-bookings',
    component: AllBookingsComponent
  },
  {
    path: 'shop-admin',
    component: ShopAdminComponent
  },
  {
    path: 'mechanics',
    component: MechanicsComponent
  },
  {
    path: 'new-mechanic',
    component: NewMechanicComponent
  },
  {
    path: 'new-service',
    component: NewServiceComponent
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
