package com.revature.aspectrum.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.aspectrum.model.Billing;
import com.revature.aspectrum.repo.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	BillingRepository billrepo;
	
	public List<Billing> getAllBilling(){
		return billrepo.findAll();
	}
	
	public Billing getBillById(int id) {
		return billrepo.findById(id).get();
	}
	
	public Billing generate(Billing billing) {
		return billrepo.save(billing);
	}
	
	public Billing update(Billing billing) {
		return billrepo.save(billing);
	}
	
	public void deleteById(int id) {
		billrepo.deleteById(id);
	}
}
