package ie.cct.gergarage.repositories;

import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.domain.Purchase;
import org.springframework.data.repository.Repository;

import java.util.ArrayList;

public interface PurchaseRepo extends Repository<Purchase,Integer> {
    Purchase save(Purchase purchase);
    ArrayList<Purchase> findByCustomer(Customer customer);


}
