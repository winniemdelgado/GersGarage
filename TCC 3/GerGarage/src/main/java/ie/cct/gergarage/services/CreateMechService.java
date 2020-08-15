package ie.cct.gergarage.services;


import ie.cct.gergarage.domain.Mechanic;
import ie.cct.gergarage.repositories.MechanicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateMechService {

    @Autowired
    MechanicRepo repo;

    public void createMech(Mechanic mech){

        repo.save(mech);
    }






}
