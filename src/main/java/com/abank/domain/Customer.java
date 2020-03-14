package com.abank.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "customer_id")
	private String customerId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String aadhaarCardNumber;
	private String panCardNumber;
	
	@JsonManagedReference("customer-address")
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Address> addressSet;
	
	@JsonManagedReference("customer-contact")
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Contact> contactSet;
	
	public Customer() {}

	public Customer(String customerId, String firstName, String middleName, String lastName, String aadhaarCardNumber,
			String panCardNumber, Set<Address> addressSet, Set<Contact> contactSet) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.aadhaarCardNumber = aadhaarCardNumber;
		this.panCardNumber = panCardNumber;
		this.addressSet = addressSet;
		this.contactSet = contactSet;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAadhaarCardNumber() {
		return aadhaarCardNumber;
	}

	public void setAadhaarCardNumber(String aadhaarCardNumber) {
		this.aadhaarCardNumber = aadhaarCardNumber;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public Set<Address> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<Address> addressSet) {
		this.addressSet = addressSet;
	}

	public Set<Contact> getContactSet() {
		return contactSet;
	}

	public void setContactSet(Set<Contact> contactSet) {
		this.contactSet = contactSet;
	}
	
}
