package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Supply;
import ie.cct.gergarage.repositories.SupplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FindAllSupplyInstockService {

    @Autowired
    SupplyRepo repo;

    public ArrayList<Supply> findAllSupply(){


        ArrayList<Supply> allSupplies =  repo.findAll();
        ArrayList<Supply> suppliesInStock = new ArrayList<>();
        for(Supply supply: allSupplies){

            if(supply.getInstock()){

                suppliesInStock.add(supply);
            }

        }
        return suppliesInStock;
    }
}
