import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LoginInfo } from './interfaces/login.info';


@Injectable({
    providedIn:'root'
})
export class ApiService {
    
//This file is the main routers to url requests, where methods in page.ts are called through this page
    constructor(private http: HttpClient) { }
    public loginInfo
    public  async sendLoginInfo(login,password){
        let response
         response = await this.http.get<any>('http://localhost:8080/customers/login', {params:{ login:login,password:password },observe:'response'}).toPromise();
        this.loginInfo = response.body
        console.log(response)
        if(response.body === null){
            return 'failed'
        }
    }
    public  async sendAdmin(login,password){
        let response
         response = await this.http.get<any>('http://localhost:8080/customers/login-admin', {params:{ login:login,password:password },observe:'response'}).toPromise();
        this.loginInfo = response.body
        console.log(response)
        if(response.body === null){
            return 'failed'
        }
    }
    public retrieveAllCustomerBooking():Observable<any>{
        console.log(this.loginInfo)
        return this.http.post<any>('http://localhost:8080/customers/my-bookings', this.loginInfo)
    }
    public retrieveAllBookings():Observable<any>{
        return this.http.get<any>('http://localhost:8080/bookings/all-bookings')
    }
    public async deleteBooking(booking){
        
       await  this.http.delete('http://localhost:8080/bookings/delete-booking',{params:{id:booking}}).toPromise()
        return await this.http.post<any>('http://localhost:8080/customers/my-bookings', this.loginInfo).toPromise()
    }
    public async deleteBookingAdmin(booking){
        
        await  this.http.delete('http://localhost:8080/bookings/delete-booking',{params:{id:booking}}).toPromise()
         return await this.http.get<any>('http://localhost:8080/bookings/all-bookings').toPromise()
     }
    public retrieveServices():Observable<any>{
        return this.http.get('http://localhost:8080/supply/stock')
    }
    public async purchase(cost){
        console.log('b')
       await this.http.post('http://localhost:8080/supply/purchase',{},{params:{cost: cost, id: this.loginInfo.customerid}}).toPromise()
    }
    public retrieveAvailableMechanics():Observable<any>{
        return this.http.get<any>('http://localhost:8080/mechanic/mechanic-availability')
    }
    public retrieveAllMechanics():Observable<any>{
        return this.http.get<any>('http://localhost:8080/mechanic/all-mechanics')
    }
    public async register(customer){
        await this.http.post('http://localhost:8080/customers/create-customer',customer).toPromise()
    }
    public async createBooking(mechanic,type){
        console.log('a')
       let booking = {
            "bookingid": null,
        "bookingtype": type,
        "cost": 200.0,
        "bookingdate": null,
        "mechanic":null,
        "customer": null,
        "progress": "Booked"
    }
        await this.http.post('http://localhost:8080/bookings/new-booking',booking,{params:{mechid:mechanic,custid:this.loginInfo.customerid}}).toPromise()
    }
    public async updateService(service){
        await this.http.put("http://localhost:8080/supply/edit-supply",service).toPromise()
        return await this.http.get('http://localhost:8080/supply/stock').toPromise()
    }
    public async deleteService(service){
        await this.http.delete('http://localhost:8080/supply/delete-supply',{params:{id:service}}).toPromise()
        return await this.http.get('http://localhost:8080/supply/stock').toPromise()
    }
    public async deleteMechanic(mechanic){
        await this.http.delete("http://localhost:8080/mechanic/delete-mechanic",{params:{id:mechanic}}).toPromise()
        return this.http.get('http://localhost:8080/mechanic/mechanic-availability').toPromise()
    }
    public async createMechanic(mechanic){
        await this.http.post("http://localhost:8080/mechanic/create",mechanic).toPromise()
    }
    public async updateBooking(booking){
        await this.http.put('http://localhost:8080/bookings/edit-booking',booking).toPromise()
        return this.http.get<any>('http://localhost:8080/bookings/all-bookings').toPromise()
    }
    public async createService(service){
        await this.http.post("http://localhost:8080/supply/create-supply",service).toPromise()
    }
} 