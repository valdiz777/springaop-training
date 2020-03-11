package com.zadentech.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * CommonPointcutConfig
 */
public class CommonPointcutConfig {

    @Pointcut("execution(* com.zadentech.springaop.business.*.*(..))")
    public void businessLayerExecution() {

    }

    @Pointcut("execution(* com.zadentech.springaop.data.*.*(..))")
    public void dataLayerExecution() {
        
    }

    @Pointcut("com.zadentech.springaop.aspect.CommonPointcutConfig.dataLayerExecution() && com.zadentech.springaop.aspect.CommonPointcutConfig.businessLayerExecution()")
    public void allLayerExecution() {
        
    }

    @Pointcut("bean(*entity*)")
    public void beanStartingWithEntity() {

    }

    @Pointcut("within(com.zadentech.springaop.data..*)")
    public void beanWithinWithEntity() {

    }

    @Pointcut("@annotation(com.zadentech.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation() {

    }
}