package ie.cct.gergarage.repositories;

import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.domain.Mechanic;
import org.springframework.data.repository.Repository;

import ie.cct.gergarage.domain.Booking;

import java.util.ArrayList;
import java.util.Optional;

public interface BookingRepo extends Repository<Booking, Integer> {
	
	Booking save(Booking b);
	ArrayList<Booking> findAll();
	ArrayList<Booking> findByCustomer(Customer customer);
	void deleteById(Integer id);

}
