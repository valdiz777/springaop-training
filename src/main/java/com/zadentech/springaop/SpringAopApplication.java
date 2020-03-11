package com.zadentech.springaop;

import com.zadentech.springaop.business.BusinessOne;
import com.zadentech.springaop.business.BusinessTwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);

	@Autowired
	BusinessOne businessOne;

	@Autowired
	BusinessTwo businessTwo;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(businessOne.calculateSomething());
		logger.info(businessTwo.calculateSomething());
	}

}
