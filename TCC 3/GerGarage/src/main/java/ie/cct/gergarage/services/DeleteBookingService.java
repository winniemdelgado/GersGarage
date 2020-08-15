package ie.cct.gergarage.services;

import ie.cct.gergarage.repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DeleteBookingService {

    @Autowired
    BookingRepo repo;


    @Transactional
    public void deleteBooking(Integer id){

        repo.deleteById(id);
    }


}
