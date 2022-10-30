package com.SprigFrameworkAssignment.SprigFrameworkAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprigFrameworkAssignmentApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext=SpringApplication.run(SprigFrameworkAssignmentApplication.class, args);
		College college= applicationContext.getBean("collegebean", College.class);
		college.education();
        Health health = new Health(new Exercise());
        health.healthy();
	}

}
