package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindAllCustomersService {

    @Autowired
    CustomerRepo repo;

    public Optional<Customer> findAllCustomer(){
        return repo.findAll();
    }


}
