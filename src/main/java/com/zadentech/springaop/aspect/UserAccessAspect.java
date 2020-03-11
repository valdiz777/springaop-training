package com.zadentech.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * BeforeAspect
 */
@Aspect
@Configuration
public class UserAccessAspect {
    private Logger logger = LoggerFactory.getLogger(UserAccessAspect.class);

    // What kind of method calls to intercept
    // execution(* PACKAGE.*.*(..))
    // intercept all calls in springaop package: @Before("execution(*
    // com.zadentech.springaop..*.*(..))")
    // intercept all calls in springaop.business package: @Before("execution(*
    // com.zadentech.springaop.business.*.*(..))")
    // or use CommonPointcutConfig as demonstrated below
    @Before("com.zadentech.springaop.aspect.CommonPointcutConfig.dataLayerExecution()")
    public void checkUserAccess(JoinPoint joinPoint) {
        logger.info(" Check for user access ");
        logger.info(" Allowed execution for {}", joinPoint);
    }

    @AfterReturning(value = "com.zadentech.springaop.aspect.CommonPointcutConfig.businessLayerExecution()", returning = "result")
    public void validateUserActions(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value = "com.zadentech.springaop.aspect.CommonPointcutConfig.businessLayerExecution()", throwing = "exception")
    public void getExceptionInformation(JoinPoint joinPoint, Object exception) {
        logger.info("{} throw expection {}", joinPoint, exception);
    }

    @After(value = "com.zadentech.springaop.aspect.CommonPointcutConfig.businessLayerExecution()")
    public void endGraciously(JoinPoint joinPoint) {
        logger.info("{} throw expection or return value {}", joinPoint);
    }
}