package com.zadentech.springaop.business;

import com.zadentech.springaop.entity.EntityTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BusinessOne
 */
@Service
public class BusinessTwo {
    @Autowired
    private EntityTwo entityTwo;

    public String calculateSomething() {
        return entityTwo.retrieveSomething();
    }
}