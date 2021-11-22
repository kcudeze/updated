package com.cwg.cust.demo.cwg.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Data
public class CustomerEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstName")
    private String  firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
}
