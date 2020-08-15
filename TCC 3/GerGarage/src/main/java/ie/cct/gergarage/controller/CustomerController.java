package ie.cct.gergarage.controller;

import ie.cct.gergarage.domain.Booking;
import ie.cct.gergarage.domain.Customer;
import ie.cct.gergarage.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CreateCustomerService createCustomerService;

    @Autowired
    FindAllCustomersService findAllCustomersService;

    @Autowired
    FindByIdCustomerService findByIdCustomerService;

    @Autowired
    DeleteCustomerService deleteCustomerService;

    @Autowired
    UpdateCustomerService updateCustomerService;

    @Autowired
    LoginCustomerService logincustomerService;

    @Autowired
    FindBookingByCustomerService findBookingByCustomerService;

    @Autowired
    LoginAdminService loginAdminService;

    @PostMapping("/create-customer")
    private void createCustomer(@RequestBody Customer c) {

        createCustomerService.createCustomer(c);

    }

    @GetMapping("/all")
    private Optional<Customer> allCustomers() {
        return findAllCustomersService.findAllCustomer();

    }

    @GetMapping("/customerId")
    private Optional<Customer> findById(@RequestParam Integer id) {
        return findByIdCustomerService.findById(id);

    }

    @PutMapping("/update")
    private void updateCustomer(@RequestBody Customer c) {

        updateCustomerService.updateCustomer(c);

    }


    @GetMapping("/login-admin")
    private Customer loginAdmin(@RequestParam String login, String password){

        return loginAdminService.loginAdmin(login,password);


    }

    @GetMapping("/login")
    private Customer loginCustomer(@RequestParam String login, String password) {

      return
              logincustomerService.loginCustomer(login, password);


    }

    @DeleteMapping("/del")
    private void deleteById(@RequestParam Integer id) {
        deleteCustomerService.deleteCustomer(id);

    }


    @PostMapping("/my-bookings")
    private ArrayList<Booking> myBookings(@RequestBody Customer customer) {


        return findBookingByCustomerService.findByCustomer(customer);

    }

}
