package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Booking;
import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.domain.Mechanic;
import ie.cct.gergarage.domain.Purchase;
import ie.cct.gergarage.repositories.BookingRepo;
import ie.cct.gergarage.repositories.CustomerRepo;
import ie.cct.gergarage.repositories.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreateBookingService {

    @Autowired
    BookingRepo repo;

    @Autowired
    PurchaseRepo purchaseRepo;

    @Autowired
    CustomerRepo custRepo;

    public CreateBookingService() {
    }

    public void createBooking(Booking booking, Integer mechid, Integer custid){

        Mechanic m = new Mechanic();
        m.setMechanicid(mechid);

        Customer c = new Customer();
        c.setCustomerid(custid);

        booking.setCustomer(c);
        booking.setMechanic(m);

        Purchase purchase = new Purchase();
        purchase.setCustomer(custRepo.findById(custid).get());
        purchase.setCost(booking.getCost());

        repo.save(booking);
        purchaseRepo.save(purchase);
    }


}
