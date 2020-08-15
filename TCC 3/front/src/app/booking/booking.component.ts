import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.scss'],
})
export class BookingComponent implements OnInit {
  public bookings 

async deleteBooking(booking){
  console.log(booking)
  this.bookings = await this.api.deleteBooking(booking.bookingid)
}
public updateBookings(){
  this.api.retrieveAllCustomerBooking().subscribe(data =>{this.bookings = data})
}

  constructor(private api: ApiService) { }
  ngOnInit()
  {
    this.api.retrieveAllCustomerBooking().subscribe(data =>{
      this.bookings = data
    })
}

}
