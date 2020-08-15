package ie.cct.gergarage.controller;


import ie.cct.gergarage.domain.Mechanic;
import ie.cct.gergarage.services.CreateMechService;

import ie.cct.gergarage.services.DeleteMechService;
import ie.cct.gergarage.services.FindAllMechanicAvailaibilityService;
import ie.cct.gergarage.services.FindAllMechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/mechanic")
public class MechController {

    @Autowired
    CreateMechService createMechService;

    @Autowired
    DeleteMechService deleteMechService;

    @Autowired
    FindAllMechanicAvailaibilityService findAllMechanicAvailaibilityService;

    @Autowired
    FindAllMechanicService findAllMechanicService;

    @PostMapping("/create")
    private void createMech(@RequestBody Mechanic mech){

        createMechService.createMech(mech);

    }

    @DeleteMapping("/delete-mechanic")
    private void deleteMech(@RequestParam Integer id){

        deleteMechService.deleteMechanic(id);



    }



    @GetMapping("/all-mechanics")
    private ArrayList<Mechanic> allMechanics(){

        return findAllMechanicService.findAllMechanics();

    }



    @GetMapping("/mechanic-availability")
    private ArrayList<Mechanic> mechanicAvailability(){

       return findAllMechanicAvailaibilityService.findAllMechanicAvailability();


    }


}
