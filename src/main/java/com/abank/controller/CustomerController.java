package com.abank.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abank.client.AccountServiceClient;
import com.abank.domain.Customer;
import com.abank.model.BankAccount;
import com.abank.model.CustomerResponse;
import com.abank.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	/*
	 * @Autowired private AccountServiceClient accountServiceClient;
	 */
	
	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		Customer customerObj = customerService.createCustomer(customer);
		return customerObj;
	}
	
	@GetMapping("/findById/{customerId}")
	public Customer findByCustomerId(@PathVariable String customerId)
	{
		Customer customerObj = customerService.findByCustomerId(customerId);
		return customerObj;
	}
	
	@GetMapping("/findByAadhaarCardNumber/{aadharCardNumber}")
	public Customer findByAadhaarCardNumber(@PathVariable String aadharCardNumber)
	{
		Customer customerObj = customerService.findByAadhaarCardNumber(aadharCardNumber);
		return customerObj;
	}
	
	@GetMapping("/findByPanCardNumber/{panCardNumber}")
	public Customer findByPanCardNumber(@PathVariable String panCardNumber)
	{
		Customer customerObj = customerService.findByPanCardNumber(panCardNumber);
		return customerObj;
	}
	
	@GetMapping("/findCustomerBankDetails/{customerId}")
	public CustomerResponse findCustomerBankDetails(@PathVariable String customerId)
	{
		Customer customer = customerService.findByCustomerId(customerId);
		//Set<BankAccount> account = accountServiceClient.findByAccountByCustomerId(customerId);
		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setCustomer(customer);
		//customerResponse.setBankAccount(account);
		return customerResponse;
	}
}
