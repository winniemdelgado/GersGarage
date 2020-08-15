package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Supply;
import ie.cct.gergarage.repositories.SupplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FindAllSupplyService {

    @Autowired
    SupplyRepo repo;

    public ArrayList<Supply> findAllSupply(){


        return repo.findAll();


    }


}
