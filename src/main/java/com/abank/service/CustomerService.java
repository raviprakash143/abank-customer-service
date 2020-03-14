package com.abank.service;

import org.springframework.stereotype.Service;

import com.abank.domain.Customer;

@Service
public interface CustomerService {
	
	public Customer createCustomer(Customer customer);
	public Customer findByCustomerId(String customerId);
	public Customer findByAadhaarCardNumber(String aadharCardNumber);
	public Customer findByPanCardNumber(String panCardNumber);
}
