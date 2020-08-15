import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';
import { BookingComponent } from '../booking/booking.component';

@Component({
  selector: 'app-new-booking',
  templateUrl: './new-booking.component.html',
  styleUrls: ['./new-booking.component.scss'],
})
export class NewBookingComponent implements OnInit {
  mechanics = []
  selectedMechanic
  selectedType
  constructor(private api:ApiService) { }
  setMechanic(event: any){
    console.log(event.target.value)
    this.selectedMechanic = event.target.value
  }
  setType(event: any){
    console.log(event.target.value)
    this.selectedType = event.target.value
  }
  async sendBooking(){
    await this.api.createBooking(this.selectedMechanic,this.selectedType)
  }
  ngOnInit() {
    this.api.retrieveAvailableMechanics().subscribe(data => this.mechanics = data)
  }

}
