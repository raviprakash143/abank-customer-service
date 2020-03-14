package com.abank.model;

import java.util.Set;

import com.abank.domain.Customer;

public class CustomerResponse {

	private Customer customer;

	private Set<BankAccount> bankAccount;

	public CustomerResponse() {}

	public CustomerResponse(Customer customer, Set<BankAccount> bankAccount) {
		super();
		this.customer = customer;
		this.bankAccount = bankAccount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(Set<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

}
