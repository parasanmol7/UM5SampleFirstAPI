package com.firstSpringApi.UM5SampleFirstAPI.controller;

import com.firstSpringApi.UM5SampleFirstAPI.UM.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customerdetails")
public class CustomerAPIService
{
    Customer customer;

    @GetMapping("{customerId}")
    public Customer getCustomerDetails(String customerId)
    {
   //     return new Customer("C1","Anm",
   //             "Par","BC");
        return customer;
    }
    @PostMapping
    public String addCustomer(@RequestBody Customer customer)
    {
        this.customer = customer;
        return "Customer Added Successfully";
    }

    @PutMapping
    public String updateCustomer(@RequestBody Customer customer)
    {
        this.customer = customer;
        return "Customer updated Successfully";
    }

    @DeleteMapping ("{customerId}")
    public String deleteCustomer(String customerId)
    {
        this.customer = null;
        return "Customer Deleted Successfully";
    }


}
