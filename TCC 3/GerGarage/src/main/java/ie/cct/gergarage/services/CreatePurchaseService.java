package ie.cct.gergarage.services;


import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.domain.Purchase;
import ie.cct.gergarage.domain.Supply;
import ie.cct.gergarage.repositories.CustomerRepo;
import ie.cct.gergarage.repositories.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePurchaseService {

    @Autowired
    PurchaseRepo repo;

    @Autowired
    CustomerRepo custRepo;

    public Purchase createPurchase(Double cost, Integer id){

        Purchase purchase = new Purchase();
        purchase.setCost(cost);
        purchase.setCustomer(custRepo.findById(id).get());

        repo.save(purchase);

        return purchase;


    }

}
