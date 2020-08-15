import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';

@Component({
  selector: 'app-shop-admin',
  templateUrl: './shop-admin.component.html',
  styleUrls: ['./shop-admin.component.scss'],
})
export class ShopAdminComponent implements OnInit {
  services
  constructor(private api:ApiService) { }
  async delete(service){
    console.log(service)
   this.services = await this.api.deleteService(service.partid)
  }
  setName(service, event:any){
    this.services[this.services.indexOf(service)].partname = event.target.value
  }
  setCost(service, event:any){
    this.services[this.services.indexOf(service)].cost = event.target.value
    console.log(this.services)
  }
  async save(service){
    this.services = await this.api.updateService(service)
  }
  ngOnInit() {
    this.api.retrieveServices().subscribe(data => this.services = data)
  }

}
