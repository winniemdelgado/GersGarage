package ie.cct.gergarage.services;

import ie.cct.gergarage.domain.Mechanic;
import ie.cct.gergarage.repositories.MechanicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FindAllMechanicAvailaibilityService {

    @Autowired
    MechanicRepo repo;

    public ArrayList<Mechanic> findAllMechanicAvailability(){

        ArrayList<Mechanic> allMechanics = repo.findAll();
        ArrayList<Mechanic> availabilityMechanic = new ArrayList<>();

        for(Mechanic mechanic : allMechanics){
            if(mechanic.getAvailability()){

                availabilityMechanic.add(mechanic);
            }


        }



        return availabilityMechanic;

    }

}
