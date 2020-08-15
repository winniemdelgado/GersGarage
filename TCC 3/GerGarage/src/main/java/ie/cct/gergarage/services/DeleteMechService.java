package ie.cct.gergarage.services;

import ie.cct.gergarage.repositories.MechanicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DeleteMechService {

    @Autowired
    MechanicRepo repo;

    @Transactional
    public void deleteMechanic(Integer id){

        repo.deleteById(id);




    }





}
