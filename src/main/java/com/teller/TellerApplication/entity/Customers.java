package com.teller.TellerApplication.entity;

import lombok.*;

import javax.persistence.*;

//@Builder
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Table(name = "customers")
public class Customers {

    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "SALARY")
    private long salary;

}
