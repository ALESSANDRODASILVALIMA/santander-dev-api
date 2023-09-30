package com.example.santanderdevapi.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private String Agency;

    @Column(scale = 13, precision = 2)
    private BigDecimal Balance;
    
    @Column(name = "Limit_account")
    private BigDecimal Limit;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAgency() {
        return Agency;
    }
    public void setAgency(String agency) {
        Agency = agency;
    }
    public BigDecimal getBalance() {
        return Balance;
    }
    public void setBalance(BigDecimal balance) {
        Balance = balance;
    }
    public BigDecimal getLimit() {
        return Limit;
    }
    public void setLimit(BigDecimal limit) {
        Limit = limit;
    }

}
