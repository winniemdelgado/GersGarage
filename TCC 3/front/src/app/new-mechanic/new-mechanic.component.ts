import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';

@Component({
  selector: 'app-new-mechanic',
  templateUrl: './new-mechanic.component.html',
  styleUrls: ['./new-mechanic.component.scss'],
})
export class NewMechanicComponent implements OnInit {

  constructor(private api:ApiService) { }
  availability
  setAvailability(event:any){
    if(event.target.value ==='true'){
      this.availability = true
    }else{
      this.availability = false
    }
  }
  async sendMechanic(name, phone){
    let mechanic = {
      mechanicid: null,
      mechanicName: name,
      mechanicPhone:phone,
      availability: this.availability
    }
    await this.api.createMechanic(mechanic)
  }
  ngOnInit() {}

}
