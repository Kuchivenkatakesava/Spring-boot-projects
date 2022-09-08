package com.zensar.bean.pack1;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="person10")
public class person {
	
	@Id
	@Column
	
	private int personId;
	
	@Column
	private String PersonName;
	
	@Column
	private LocalDate dateOfBirth;
	
	@Column
	private char gender;
	
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private contactInfo contactInfo;
	
	public person(String personName, LocalDate dateOfBirth, char gender) {
		super();
		PersonName = personName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public person() {
		super();
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public contactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(contactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	@Override
	public String toString() {
		return "person [personId=" + personId + ", PersonName=" + PersonName + ", gender=" + gender + ", contactInfo="
				+ contactInfo + "]";
	}
	

	
}
