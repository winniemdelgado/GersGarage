package ie.cct.gergarage.services;


import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginAdminService {

    @Autowired
    CustomerRepo repo;

    public Customer loginAdmin(String login, String password){

        Customer customer = repo.findByCustomerloginAndCustomerpassword(login,password);
        if(customer.getAccess()){
            return customer;
        }else{
            return null;
        }


    }


}
