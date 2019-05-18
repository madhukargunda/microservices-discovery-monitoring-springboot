package com.study.pattern.account.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.study.pattern.account.constants.AccountType;

import lombok.Data;

@Entity
@Data
@Table(name = "account")
public class Account {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "customer_id")
	private Integer customerId;

	@Column(name = "account_number")
	private String accountNumber;

	@Column(name = "account_type")
	@Enumerated(EnumType.STRING)
	private AccountType accountType;

	@Column(name = "balance")
	private BigDecimal balance;

	@Column(name = "date_created")
	private Date dateCreated;

	@Column(name = "date_modified")
	private Date dateModified;

	public Account() {

	}
}
