package com.study.pattern.customer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "customer_type")
	@Enumerated(EnumType.STRING)
	private CustomerType type;

	@Column(name = "account_number")
	private String accountNumber;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "email_address")
	private String emailAddress;
	
	@Column(name = "date_joined")
	private Date dateJoined;

	public Customer() {
		
	}
	
}
