package com.revature.aspectrum.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;

//@JsonIgnoreProperties({"hibernateLazyInitialzer"})
@Data
@Entity
@Table (name="billing")
public class Billing implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column (name="amount")
	private double amount;
	
	//private int account;
	
	@Column (name="product")
	private String product;
	
	private double payment;
	
	@Column(name="payment_type")
	private String paymentType;
	
	@Column(name="paid_date")
	private Date paidDate;
	
	//@JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account")
    private User user;

	
	
}