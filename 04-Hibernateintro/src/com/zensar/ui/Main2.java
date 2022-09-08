package com.zensar.ui;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.bean.Employee;

import com.zensar.util.HibernateUtil;
public class Main2 {
	static void insert() {
		Employee employee=new Employee();
		employee.setName("sushmanth");
		employee.setBasic(60000.00);
		employee.setDateOfJoin(LocalDate.of(2022,03,28));
		employee.setGrade('A');
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(employee);
		tx.commit();
		
		
		HibernateUtil.cleanUp();
		
	}
	static void load() {
		 Employee employee=null;
		 
		 Session session=null;
		 HibernateUtil.init();
		 session=HibernateUtil.getSession();
		 
		 employee=session.load(Employee.class,3);
		 
		 System.out.println(employee);
		 
		 HibernateUtil.cleanUp();
	}	 
	
	 static void loadAll() {
		   HibernateUtil.init();
		   Session session=HibernateUtil.getSession();
		   
		   String qry="from Employee";//HQL
		   Query query=session.createQuery(qry);
		   List<Employee> allEmployee=query.list();
		   System.out.println(allEmployee);
		   
		   HibernateUtil.cleanUp();
		   
	   }
	 static void editing() {
		   HibernateUtil.init();
		   Session session=HibernateUtil.getSession();
		   
		   Employee employee=session.load(Employee.class, 3);
		 
		   employee.setBasic(100000);
		   
		   Transaction tx=session.beginTransaction();
		   session.update(employee);
		   tx.commit();
		   
		   HibernateUtil.cleanUp();
	 }
	 
	 static void deleting() {
		   HibernateUtil.init();
		   Session session=HibernateUtil.getSession();
		   Employee employee=session.load(Employee.class, 3);
		   employee.setBasic(100000);
		   Transaction tx=session.beginTransaction();
		   session.delete(employee);
		   tx.commit();
		   
		   HibernateUtil.cleanUp();
		   
	   }
	
	
	public static void main(String[] args) {
		deleting();
		
	}
	
}	
