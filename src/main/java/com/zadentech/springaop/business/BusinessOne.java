package com.zadentech.springaop.business;

import com.zadentech.springaop.aspect.TrackTime;
import com.zadentech.springaop.entity.EntityOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BusinessOne
 */
@Service
public class BusinessOne {
    @Autowired
    private EntityOne entityOne;

    @TrackTime
    public String calculateSomething() {
        return entityOne.retrieveSomething();
    }
}