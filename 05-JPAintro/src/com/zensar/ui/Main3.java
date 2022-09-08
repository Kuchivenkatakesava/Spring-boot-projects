package com.zensar.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.zensar.bean.Address;
import com.zensar.bean.student;
import com.zensar.util.JPAUtil;

public class Main3 {
	static void insert() {
		
		Address address=new Address("F-3", "Wilson Garden","Hyderabad");
		com.zensar.bean.student student=new student();
		student.setRollNumber(1023);
		student.setName("janu");
		
		student.setAddress(address);
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	static void load() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		student student=em.find(student.class, 1022);
		
		System.out.println(student);
		JPAUtil.shutDown();
		
	}
	
	static void loadAll() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		String qry="from student";
		Query query=em.createQuery(qry);
		List<student> allstudents=query.getResultList();
		System.out.println(allstudents);
		JPAUtil.shutDown();
		
	}
	
	static void editing() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		student student=em.find(student.class, 1022);
		student.setName(student.getName().toUpperCase());
		student.getAddress().setCityName("Banglore");
		
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
		
	}
	static void deleting() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		student student=em.find(student.class, 1022);
		
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}	
	
		
	
		
	

	public static void main(String[] args) {
	    
		deleting();

	}

}
