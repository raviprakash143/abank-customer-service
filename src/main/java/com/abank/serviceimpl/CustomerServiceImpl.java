package com.abank.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.abank.domain.Customer;
import com.abank.repository.CustomerRepository;
import com.abank.service.CustomerService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		Customer customerObj = customerRepository.save(customer);
		return customerObj;
	}

	@Override
	public Customer findByCustomerId(String customerId) {
		Optional<Customer> customerObj = customerRepository.findById(customerId);
		return customerObj.get();
	}

	@Override
	public Customer findByAadhaarCardNumber(String aadharCardNumber) {
		Customer customerObj = customerRepository.findByAadhaarCardNumber(aadharCardNumber);
		return customerObj;
	}

	@Override
	public Customer findByPanCardNumber(String panCardNumber) {
		Customer customerObj = customerRepository.findByPanCardNumber(panCardNumber);
		return customerObj;
	}

}
