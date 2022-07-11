package com.revature.aspectrum.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.aspectrum.model.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer> {
	

}