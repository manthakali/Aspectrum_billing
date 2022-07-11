package com.revature.aspectrum.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.aspectrum.model.Billing;
import com.revature.aspectrum.service.BillingService;


@RestController
//@RequestMapping("Billing")
public class BillingController {
	
	@Autowired
	BillingService billingService;

	
	@GetMapping("/bill")
	public String bill() {
		return "This is current month bill";
	}
	@GetMapping("/data/billing")
	public List<Billing> getAllBilling(){
		return billingService.getAllBilling();

	}
	
	@GetMapping("/data/billing{id}")
	public Billing getBillById(@PathVariable int id) {
		return billingService.getBillById(id);
		
	}
	
	@PostMapping("/data/billing")
	public Billing create(@RequestBody Billing billing) {
		return billingService.generate(billing);
		
		
	}
	
	@PutMapping("/data/billing{id}")
	public Billing updateBill(@PathVariable int id, @RequestBody Billing billing) {
		return billingService.update(billing);
		
	}
	
	@DeleteMapping("/data/billing{id}")
	public void deleteBill(@PathVariable int id) {
		 billingService.deleteById(id);
		
	}
	
	
	
}
