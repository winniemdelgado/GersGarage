import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent implements OnInit {
  constructor(private api: ApiService,private router:Router) { }

  async sendInfo(login, password) {

    let response = await this.api.sendLoginInfo(login, password)
    if(response==='failed'){
      console.log('try again')
    }else{
      this.router.navigateByUrl('/home')
    }
  }
  async sendAdmin(login, password) {

    let response = await this.api.sendAdmin(login, password)
    if(response==='failed'){
      console.log('try again')
    }else{
      this.router.navigateByUrl('/all-bookings')
    }
  }
  ngOnInit() { }

}
