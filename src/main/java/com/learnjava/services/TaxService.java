package com.learnjava.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
//test git
    public double tax(double amount){
        return amount * 0.2;
    }
}
