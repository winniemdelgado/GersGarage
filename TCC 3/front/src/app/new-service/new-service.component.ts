import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';

@Component({
  selector: 'app-new-service',
  templateUrl: './new-service.component.html',
  styleUrls: ['./new-service.component.scss'],
})
export class NewServiceComponent implements OnInit {
  inStock
  setInStock(event:any){
    if(event.target.value ==='true'){
      this.inStock = true
    }else{
      this.inStock = false
    }
  }
  constructor(private api:ApiService) { }
  async sendService(name,cost){
   let service = {
      partid:null,
      cost:cost,
      partname:name,
      instock:this.inStock
    }
    await this.api.createService(service)
  }
  ngOnInit() {}

}
