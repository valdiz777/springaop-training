package com.zadentech.springaop.entity;

import org.springframework.stereotype.Repository;

/**
 * Entity
 */
@Repository
public class EntityTwo {
    public String retrieveSomething() {
        return "EntityTwo";
    }
}