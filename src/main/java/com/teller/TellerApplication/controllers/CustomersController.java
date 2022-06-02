package com.teller.TellerApplication.controllers;

import com.teller.TellerApplication.entity.Customers;
import com.teller.TellerApplication.services.CustomersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/customer")
public class CustomersController {

    @Autowired
    private CustomersServices customersServices;

    @GetMapping(name = "getAllCustomers")
    public List<Customers> getAllCustomers(){ return customersServices.findAll();}

}
