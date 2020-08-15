package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Booking;
import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FindBookingByCustomerService {

    @Autowired
    BookingRepo repo;

    public ArrayList<Booking> findByCustomer(Customer customer){


        return repo.findByCustomer(customer);


    }


}
