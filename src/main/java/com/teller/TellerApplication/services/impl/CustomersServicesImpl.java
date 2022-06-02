package com.teller.TellerApplication.services.impl;

import com.teller.TellerApplication.entity.Customers;
import com.teller.TellerApplication.repository.CustomersRepository;
import com.teller.TellerApplication.services.CustomersServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomersServicesImpl implements CustomersServices {

    @Autowired
    private CustomersRepository customersRepository;

    @Override
    public List<Customers> findAll() {
        return customersRepository.findAll();
    }
}
