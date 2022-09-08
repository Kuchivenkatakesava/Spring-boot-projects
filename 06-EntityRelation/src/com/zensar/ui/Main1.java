package com.zensar.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.contactInfo;
import com.zensar.bean.pack1.person;
import com.zensar.util.JPAUtil;

public class Main1 {
	static void test1() {
		person person=new person("kesava",LocalDate.of(1999, 06, 17), 'M');
		person.setPersonId(1011);
	    contactInfo contactInfo=new contactInfo("kesava@gmail.com","3245364723");
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
			
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
	}	
		
	static void test2() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		person personInfo=em.find(person.class, 546);
		System.out.println(personInfo);
		
		JPAUtil.shutDown();
		
	}
	
	static void test3() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		contactInfo contactInfo=em.find(contactInfo.class,546);
		System.out.println(contactInfo);
		System.out.println(contactInfo.getPerson());
		
		JPAUtil.shutDown();
		
	}
	
 public static void main(String[] args) {
	test3();
}
}
