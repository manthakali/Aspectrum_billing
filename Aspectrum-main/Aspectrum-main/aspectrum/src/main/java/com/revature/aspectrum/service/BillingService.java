package com.revature.aspectrum.service;

import java.util.List;

import com.revature.aspectrum.model.Billing;

public interface BillingService {
	
	public List<Billing> getAllBilling();

	public Billing getBillById(int id);
		
	public Billing generate(Billing billing);
		
	public Billing update(Billing billing);
	
	public void deleteById(int id); 
		
}
