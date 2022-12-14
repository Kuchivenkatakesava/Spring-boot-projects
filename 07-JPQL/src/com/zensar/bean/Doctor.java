package com.zensar.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;

@Entity
@Table(name="doctors10")
@NamedQueries (
        {
        @NamedQuery(name="findAll", query = "select d from Doctor d"),
        @NamedQuery(name="findById", query = "select d from Doctor d where d.id=:searchId"),
        @NamedQuery(name="updateFees", query = "update Doctor set fees=fees+200")

        }
)
@NamedNativeQueries({
    @NamedNativeQuery(name = "readAll", query = "select * from doctors10", resultClass =Doctor.class),
    @NamedNativeQuery(name = "readById", query = "select * from doctors10 where id=?", resultClass =Doctor.class)
})
public class Doctor {
	
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Id;
	String name;
	double fees;
	String gender;
	LocalDate practicingSince;
	
	
	public Doctor(String name, double fees, String gender, LocalDate practicingSince) {
		super();
		this.name = name;
		this.fees = fees;
		this.gender = gender;
		this.practicingSince = practicingSince;
	}
	
	public Doctor() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getPracticingSince() {
		return practicingSince;
	}
	public void setPracticingSince(LocalDate practicingSince) {
		this.practicingSince = practicingSince;
	}
	@Override
	public String toString() {
		return "\n Doctor [Id=" + Id + ", name=" + name + ", fees=" + fees + ", gender=" + gender + ", practicingSince="
				+ practicingSince + "]";
	}
	
   
}
