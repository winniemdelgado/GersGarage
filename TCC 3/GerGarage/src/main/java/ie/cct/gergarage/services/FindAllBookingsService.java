package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Booking;
import ie.cct.gergarage.repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FindAllBookingsService {

    @Autowired
    BookingRepo repo;

    public ArrayList<Booking> bookings() {


        return repo.findAll();

    }


}
