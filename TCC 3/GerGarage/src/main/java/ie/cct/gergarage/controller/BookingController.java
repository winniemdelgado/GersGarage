package ie.cct.gergarage.controller;


import ie.cct.gergarage.domain.Booking;

import ie.cct.gergarage.services.CreateBookingService;
import ie.cct.gergarage.services.DeleteBookingService;
import ie.cct.gergarage.services.FindAllBookingsService;
import ie.cct.gergarage.services.UpdateBookingService;
import jdk.vm.ci.meta.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    CreateBookingService createBookingService;

    @Autowired
    FindAllBookingsService findAllBookingsService;

    @Autowired
    DeleteBookingService deleteBookingService;

    @Autowired
    UpdateBookingService updateBookingService;

    @PostMapping("/new-booking")
    private void createBooking(@RequestBody Booking booking, @RequestParam Integer mechid, Integer custid){

        LocalDate date = LocalDate.now();


        booking.setBookingdate(date.plusDays(7));


        createBookingService.createBooking(booking,mechid, custid);



    }


    @GetMapping("/all-bookings")
    private ArrayList<Booking> bookings(){

        return  findAllBookingsService.bookings();

    }

    @PutMapping("/edit-booking")
    private void editBooking(@RequestBody Booking booking){
        updateBookingService.editBooking(booking);
    }


    @DeleteMapping("/delete-booking")
    private void deleteBooking(@RequestParam Integer id){

        deleteBookingService.deleteBooking(id);

    }

}
