package com.meysamzamani.datasynchronizer.presentation.controller;

import com.meysamzamani.datasynchronizer.application.CustomerService;
import com.meysamzamani.datasynchronizer.domain.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Customer getCustomer(@PathVariable("customerId") Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Customer registerNewCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @DeleteMapping(path = "{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") Long customerId) {
        customerService.deleteCustomer(customerId);
    }


}
