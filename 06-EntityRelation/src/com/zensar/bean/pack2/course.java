package com.zensar.bean.pack2;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class course {
	
	
	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int courseId;
	String courseName;
	double fees;
	
	
	Set<subject>subject;

	public course(int courseId, String courseName, double fees, Set<subject> subject) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
		this.subject = subject;
	}

	public course() {
		super();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Set<subject> getSubject() {
		return subject;
	}

	public void setSubject(Set<subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + ", subject=" + subject
				+ "]";
	}
	
	
}
