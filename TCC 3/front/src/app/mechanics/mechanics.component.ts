import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';

@Component({
  selector: 'app-mechanics',
  templateUrl: './mechanics.component.html',
  styleUrls: ['./mechanics.component.scss'],
})
export class MechanicsComponent implements OnInit {
  mechanics
  constructor(private api: ApiService) { }
  
  async deleteMechanic(mechanic){
    this.mechanics = await this.api.deleteMechanic(mechanic.mechanicid)
  }

  ngOnInit() {
    this.api.retrieveAllMechanics().subscribe(data => {this.mechanics = data})
  }

}
