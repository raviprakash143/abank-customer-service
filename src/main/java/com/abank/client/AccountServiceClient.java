package com.abank.client;

import java.util.Set;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abank.model.BankAccount;

@FeignClient("abank-account-service")
public interface AccountServiceClient {

	@GetMapping("/account/findByAccountByCustomerId/{customerId}")
	public Set<BankAccount> findByAccountByCustomerId(@PathVariable String customerId);
}
