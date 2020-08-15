package ie.cct.gergarage.services;

import ie.cct.gergarage.repositories.SupplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DeleteSupplyService {

    @Autowired
    SupplyRepo repo;

    @Transactional
    public void deleteSupply(Integer id){

        repo.deleteByPartid(id);

    }

}
