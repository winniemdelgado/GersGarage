import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
})
export class RegisterComponent implements OnInit {
 
  makes = [{
    "name": "AC"
  }, {
    "name": "AC PROPULSION"
  }, {
    "name": "ACURA"
  }, {
    "name": "A.D. TRAMONTANA"
  }, {
    "name": "ALFA ROMEO"
  }, {
    "name": "ALMAC"
  }, {
    "name": "ALTERNATIVE CARS"
  }, {
    "name": "AMUZA"
  }, {
    "name": "ANTEROS"
  }, {
    "name": "ARASH"
  }, {
    "name": "ARIEL"
  }, {
    "name": "ARRINERA"
  }, {
    "name": "ASL"
  }, {
    "name": "ASTERIO"
  }, {
    "name": "ASTON MARTIN"
  }, {
    "name": "AUDI"
  }, {
    "name": "BAC"
  }, {
    "name": "BAJAJ"
  }, {
    "name": "BEIJING AUTOMOBILE WORKS"
  }, {
    "name": "BENTLEY"
  }, {
    "name": "BMW"
  }, {
    "name": "BOLLORÉ"
  }, {
    "name": "BOLWELL"
  }, {
    "name": "BRILLIANCE / HUACHEN"
  }, {
    "name": "BRISTOL"
  }, {
    "name": "BRITISH LEYLAND"
  }, {
    "name": "BRM BUGGY"
  }, {
    "name": "BROOKE"
  }, {
    "name": "BUDDY"
  }, {
    "name": "BUFORI"
  }, {
    "name": "BUGATTI"
  }, {
    "name": "BUICK"
  }, {
    "name": "BYD"
  }, {
    "name": "CADILLAC"
  }, {
    "name": "CAPARO"
  }, {
    "name": "CARBONTECH"
  }, {
    "name": "CARICE"
  }, {
    "name": "CHANG'AN"
  }, {
    "name": "CHANGHE"
  }, {
    "name": "CHERY"
  }, {
    "name": "CHEVROLET"
  }, {
    "name": "CHEVRON"
  }, {
    "name": "CITROËN"
  }, {
    "name": "CHRYSLER"
  }, {
    "name": "COMMUTER CARS"
  }, {
    "name": "CONNAUGHT"
  }, {
    "name": "COVINI"
  }, {
    "name": "DACIA"
  }, {
    "name": "DAIHATSU"
  }, {
    "name": "DATSUN"
  }, {
    "name": "DE LA CHAPELLE"
  }, {
    "name": "DMC"
  }, {
    "name": "DIARDI"
  }, {
    "name": "DODGE"
  }, {
    "name": "DONKERVOORT"
  }, {
    "name": "DONGFENG"
  }, {
    "name": "DONTO"
  }, {
    "name": "DS AUTOMOBILES"
  }, {
    "name": "DYNASTI ELECTRIC CAR CORP."
  }, {
    "name": "E-VADE"
  }]

  types=[
    "Car",
    "Motorcycle",
    "Truck"
  ]
  fuels=[
    "Diesel",
    "Petrol",
    "Electric",
    "Ethanol",
    "Hybrid"
  ]
  selectedMake = 'vafsdsafd'
  selectedType ='gffg'
  selectedFuel

  setMake(event:any){
    this.selectedMake = event.target.value
  }
  setType(event:any){
    this.selectedType = event.target.value
  }
  setFuel(event:any){
    this.selectedFuel = event.target.value
  }
  async sendInfo(login,password,name,email,phone,license,comment){
    let customer = {
      "customerid": null,
      "customername": name,
      "customeremail": email,
      "customerphone": phone,
      "vehicletype": this.selectedType,
      "vehiclemake": this.selectedMake,
      "vehiclelicense": license,
      "vehicleFuel": this.selectedFuel,
      "commentary": comment,
      "access": false,
      "customerlogin": login,
      "customerpassword": password
  }
    await this.api.register(customer)
  }
  constructor(private api:ApiService) { }

  ngOnInit() {
  }

}
