package ie.cct.gergarage.controller;

import ie.cct.gergarage.domain.Supply;
import ie.cct.gergarage.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/supply")
public class SupplyController {

    @Autowired
    FindAllSupplyService findAllSupplyService;

    @Autowired
    FindAllSupplyInstockService findAllSupplyInstockService;

    @Autowired
    CreatePurchaseService createPurchaseService;

    @Autowired
    DeleteSupplyService deleteSupplyService;

    @Autowired
    UpdateSupplyService updateSupplyService;

    @Autowired
    CreateSupplyService createSupplyService;

    @PostMapping("/create-supply")
    public void createSupply(@RequestBody Supply supply){
        createSupplyService.createSupply(supply);
    }

    @GetMapping("/all-supplies")
    private ArrayList<Supply> allSupply(){

        return findAllSupplyService.findAllSupply();

    }

    @GetMapping("/stock")
    private ArrayList<Supply> inStockSupplies(){

        return findAllSupplyInstockService.findAllSupply();
    }

    @PostMapping("/purchase")
    private void purchase(@RequestParam Double cost, Integer id){

        createPurchaseService.createPurchase(cost,id);


    }

    @DeleteMapping("/delete-supply")
    private void deleteSupply(@RequestParam Integer id){

        deleteSupplyService.deleteSupply(id);

    }

    @PutMapping("/edit-supply")
    private void editSupply(@RequestBody Supply supply){

        updateSupplyService.updateSupply(supply);

    }

}
