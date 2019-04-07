package com.study.pattern.customer.model;

import java.util.ArrayList;
import java.util.List;



public class Contact {

	
	private Long id;

	
	private String firstName;

	
	private String lastName;

	
	private String email;

	
	private String phoneNumber;


	private PhoneType phoneType;

	//@OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Contact_Note.class)
	private List<Contact_Note> notes;

	public Contact() {
	}

	public Contact(String firstName, String lastName, String email, PhoneType phoneType, String phone) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneType = phoneType;
		this.phoneNumber = phone;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

	public List<Contact_Note> getNotes() {
		if (this.notes == null) {
			this.notes = new ArrayList<>();
		}
		return this.notes;
	}

	public void addNote(Contact_Note note) {
		getNotes().add(note);
		note.setContact(this);
	}

	public void setNotes(List<Contact_Note> addresses) {
		this.notes = addresses;
	}

}
