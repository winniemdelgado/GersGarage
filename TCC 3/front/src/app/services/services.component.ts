import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';

@Component({
  selector: 'app-services',
  templateUrl: './services.component.html',
  styleUrls: ['./services.component.scss'],
})
export class ServicesComponent implements OnInit {
  services = []
  constructor(private api : ApiService) { }
  async purchase(cost){
    console.log('a')
    await this.api.purchase(cost)
  }
  ngOnInit() {
    this.api.retrieveServices().subscribe(data => this.services = data)
  }

}
