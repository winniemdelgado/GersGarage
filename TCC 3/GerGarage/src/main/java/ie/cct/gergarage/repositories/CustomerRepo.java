package ie.cct.gergarage.repositories;

import ie.cct.gergarage.domain.Customer;
import org.springframework.data.repository.Repository;

import java.util.Optional;


public interface CustomerRepo extends Repository<Customer, Integer> {
Customer save(Customer c);
Optional<Customer> findAll();
Optional<Customer> findById(Integer id);
void deleteById(Integer id);
Customer findByCustomerloginAndCustomerpassword(String login, String password);
}
