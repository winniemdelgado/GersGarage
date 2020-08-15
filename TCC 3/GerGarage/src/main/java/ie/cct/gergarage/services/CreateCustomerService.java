package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerService {

    @Autowired
    CustomerRepo repo;

    public void createCustomer(Customer c){

        repo.save(c);

    }

}
