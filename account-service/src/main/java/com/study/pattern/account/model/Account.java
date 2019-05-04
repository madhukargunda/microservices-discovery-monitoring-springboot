package com.study.pattern.account.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="account")
public class Account {

	@Column(name="id")
	private Integer id;

	@Column(name="customer_id")
	private Integer customerId;

	@Column(name="account_number")
	private String accountNumber;

	@Column(name="account_type")
	private String accountType;

	@Column(name="date_created")
	private Date dateCreated;

	@Column(name="date_modified")
	private Date dateModified;

	public Account() {

	}

	public Account(Integer id, Integer customerId, String accountNumber, String accountType, Date dateCreated,
			Date dateModified) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", customerId=" + customerId + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + "]";
	}

}
