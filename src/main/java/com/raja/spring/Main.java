package com.raja.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raja.model.Account;
import com.raja.service.ExampleService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		ExampleService exampleService = (ExampleService) ctx
				.getBean("exampleService");

		Account account = new Account("000001", "Account 1");
		exampleService.updateAccountBalance(account, 100L);

		List<Account> accounts = exampleService.findCustomerAccounts(1L);

		account.setAccountDescription("Test Description");
		exampleService.updateAccountDescription(account);

		exampleService.methodUsingGenerics(account);

	}
}
