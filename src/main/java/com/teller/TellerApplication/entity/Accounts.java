package com.teller.TellerApplication.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "ACCOUNTS")
public class Accounts {

    @Id
    @Column(name = "ACCOUNT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "CUSTOMER_ID")
    private long customerId;

    @Column(name = "ACCOUNT_NUMBER")
    private long accountNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "SALARY")
    private long salary;
}
