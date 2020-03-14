package com.abank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abank.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

	public Customer findByAadhaarCardNumber(String aadharCardNumber);
	public Customer findByPanCardNumber(String panCardNumber);
}
