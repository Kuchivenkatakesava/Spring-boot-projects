package com.zensar.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Employee;
import com.zensar.bean.Person;
import com.zensar.util.JPAUtil;

public class Main2 {
	static void insert() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		Employee employee=new Employee();
		employee.setName("vamsi");
		employee.setBasic(30000.00);
		employee.setGrade('A');
		employee.setDateOfJoin(LocalDate.of(2022, 03, 28));
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
		
	}
	
	static void load() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Employee employee=em.find(Employee.class, 1);
		System.out.println(employee);
		
		em.close();
		emf.close();
		
	}
	
	static void editing() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Employee employee=em.find(Employee.class, 2);
		employee.setBasic(60000.00);
		
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
	
	static void deleting() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Employee employee=em.find(Employee.class, 2);
		
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}	
		
	public static void main(String[] args) {
		insert();
	}
		

}
