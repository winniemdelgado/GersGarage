package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Booking;
import ie.cct.gergarage.repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateBookingService {

    @Autowired
    BookingRepo repo;

    public void editBooking(Booking booking){
        repo.save(booking);
    }


}
