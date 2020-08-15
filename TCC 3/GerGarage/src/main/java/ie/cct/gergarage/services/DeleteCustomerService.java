package ie.cct.gergarage.services;

import ie.cct.gergarage.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class DeleteCustomerService {

    @Autowired
    CustomerRepo repo;


    @Transactional
    public void deleteCustomer(Integer id){
        repo.deleteById(id);
    }

}
