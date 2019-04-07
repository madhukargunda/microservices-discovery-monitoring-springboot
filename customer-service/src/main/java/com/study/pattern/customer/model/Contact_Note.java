package com.study.pattern.customer.model;

public class Contact_Note {

//	@Id
//	@GeneratedValue
	private Long id;

	private String message;

//	@ManyToOne
//	@JoinColumn(name = "CONTACT_ID")
	private Contact contact;

	public Contact_Note() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
