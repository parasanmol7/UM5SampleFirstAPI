package com.firstSpringApi.UM5SampleFirstAPI.controller;

import com.firstSpringApi.UM5SampleFirstAPI.model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customerdetails")
public class CustomerController
{
    Customer customer;

    @GetMapping("/{customerId}")
    public Customer getCustomerDetails(@PathVariable String customerId)
    {
        System.out.println("customer id is:"+customerId);
   //     return new Customer("C1","Anm",
   //             "Par","BC");
        return customer;
    }
    @PostMapping
    public String addCustomer(@RequestBody Customer customer)
    {


        String city = "sangrur";
        System.out.println("this is my customer"+this.customer.toString());
        return "Customer Added Successfully";
    }

    @PutMapping
    public String updateCustomer(@RequestBody Customer customer)
    {
        this.customer = customer;
        return "Customer updated Successfully";
    }

    @DeleteMapping ("/{customerId}")
    public String deleteCustomer(@PathVariable String customerId)
    {
        this.customer = null;
        return "Customer Deleted Successfully";
    }


}
