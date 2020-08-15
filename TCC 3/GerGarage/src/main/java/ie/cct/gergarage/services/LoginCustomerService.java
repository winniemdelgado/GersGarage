package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginCustomerService {

    @Autowired
    CustomerRepo repo;

    public Customer loginCustomer(String login, String password){

        Customer customer =  repo.findByCustomerloginAndCustomerpassword(login, password);
        return customer;

    }



}
