package com.zensar.bean.pack2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class subject {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int subjectId;
	
	String subjectName;
	
	int duringInHours;

	public subject(String subjectName, int duringInHours) {
		super();
		this.subjectName = subjectName;
		this.duringInHours = duringInHours;
	}

	public subject() {
		super();
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getDuringInHours() {
		return duringInHours;
	}

	public void setDuringInHours(int duringInHours) {
		this.duringInHours = duringInHours;
	}

	@Override
	public String toString() {
		return "subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", duringInHours=" + duringInHours
				+ "]";
	}
	
	

}
