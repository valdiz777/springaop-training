package com.zadentech.springaop.entity;

import com.zadentech.springaop.aspect.TrackTime;

import org.springframework.stereotype.Repository;

/**
 * Entity
 */
@Repository
public class EntityOne {
    @TrackTime
    public String retrieveSomething() {
        return "EntityOne";
    }
}