package com.zensar.ui;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.security.auth.Subject;

import com.zensar.bean.pack2.course;
import com.zensar.bean.pack2.subject;
import com.zensar.util.JPAUtil;


public class Main2 {
	
	static void test1() {
		Subject subject1 = new Subject();
		subject subject2 = new subject("Css",20);
		subject subject3 = new subject("Js",30);
		subject subject4 = new subject("Angular",25);
		
		Set<subject> subjects=new HashSet<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);
		
		course course=new course(0,"Naresh Technology",30000.00,subjects);
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
	}
			
		
public static void main(String[] args) {
	
	
		
	}

}
