package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Supply;
import ie.cct.gergarage.repositories.SupplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateSupplyService {

    @Autowired
    SupplyRepo repo;

    public void createSupply(Supply supply){
        repo.save(supply);
    }
}
