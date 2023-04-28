package com.learnjava.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
//teste git hub
    public double tax(double amount){
        return amount * 0.2;
    }
}
