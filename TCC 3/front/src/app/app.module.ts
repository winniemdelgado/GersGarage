import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { BookingComponent } from './booking/booking.component';
import { ServicesComponent } from './services/services.component';
import { NewBookingComponent } from './new-booking/new-booking.component';
import { RegisterComponent } from './register/register.component';

import { AllBookingsComponent } from './all-bookings/all-bookings.component';
import { ShopAdminComponent } from './shop-admin/shop-admin.component';
import { MechanicsComponent } from './mechanics/mechanics.component';
import { NewMechanicComponent } from './new-mechanic/new-mechanic.component';
import { NewServiceComponent } from './new-service/new-service.component';

@NgModule({
  declarations: [AppComponent,HomeComponent,LoginComponent,BookingComponent,ServicesComponent,NewBookingComponent,RegisterComponent,AllBookingsComponent,ShopAdminComponent,MechanicsComponent,NewMechanicComponent,NewServiceComponent],
  entryComponents: [],
  imports: [BrowserModule, IonicModule.forRoot(), AppRoutingModule,HttpClientModule],
  providers: [
    StatusBar,
    SplashScreen,
    { provide: RouteReuseStrategy, useClass: IonicRouteStrategy }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
