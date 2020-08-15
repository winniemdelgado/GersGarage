package ie.cct.gergarage.services;


import ie.cct.gergarage.domain.Mechanic;
import ie.cct.gergarage.repositories.MechanicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FindAllMechanicService {

    @Autowired
    MechanicRepo repo;


    public ArrayList<Mechanic> findAllMechanics(){

        return repo.findAll();
    }
}
