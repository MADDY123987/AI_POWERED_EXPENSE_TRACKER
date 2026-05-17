package com.AI.ExpenseTracker_Core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class ExpenseTrackerCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerCoreApplication.class, args);
	}
}
