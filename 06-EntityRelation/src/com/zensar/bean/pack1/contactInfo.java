package com.zensar.bean.pack1;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="contactInfo10")
public class contactInfo {
	
	@Id
	@Column
	private int contactId;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	@OneToOne()
	@MapsId
	@JoinColumn(name="person_id")
	
	private person person;

	public contactInfo(String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}

	public contactInfo() {
		super();
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public person getPerson() {
		return person;
	}

	public void setPerson(person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "contactInfo [contactId=" + contactId + ", email=" + email + ", phone=" + phone + "]";
	}
	

	
}
