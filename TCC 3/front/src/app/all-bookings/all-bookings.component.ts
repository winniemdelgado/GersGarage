import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';

@Component({
  selector: 'app-all-bookings',
  templateUrl: './all-bookings.component.html',
  styleUrls: ['./all-bookings.component.scss'],
})
export class AllBookingsComponent implements OnInit {
  bookings
  mechanics
  constructor(private api:ApiService) { }
  async deleteBooking(booking){
    this.bookings = await this.api.deleteBookingAdmin(booking.bookingid)
  }
  setMechanic(event:any,booking){
    let chosenMechanic = this.mechanics.filter((mechanic)=>{return mechanic.mechanicName === event.target.value})
    this.bookings[this.bookings.indexOf(booking)].mechanic = chosenMechanic[0]
    console.log(this.bookings)
  }
  setDate(event:any,booking){
    this.bookings[this.bookings.indexOf(booking)].date = event.target.value
    console.log(this.bookings)
  }
  setProgress(event:any,booking){
    this.bookings[this.bookings.indexOf(booking)].progress = event.target.value
    console.log(this.bookings)
  }
  setCost(event:any,booking){
    this.bookings[this.bookings.indexOf(booking)].cost = event.target.value
    console.log(this.bookings)
  }
  async save(booking){
    this.bookings = await this.api.updateBooking(booking)
  }
  ngOnInit() {
    this.api.retrieveAllBookings().subscribe(data =>{this.bookings = data})
    this.api.retrieveAvailableMechanics().subscribe(data => this.mechanics = data)
   
  }

}
