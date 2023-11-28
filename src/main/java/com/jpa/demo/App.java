
package com.jpa.demo;

import javax.persistence.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
	  private static EntityManager em;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaPU");

	        em = emf.createEntityManager();

	     // Create Entity

	        Employee employee = new Employee("Abc",12345.5f);
	        
	        EntityTransaction etrans=em.getTransaction();
	        
//	       
//	        etrans.begin();//quick start- ready to perform set of operations
//	        
//	        em.persist(employee);//for insert the details -insert into employee values(
//	        
//	        etrans.commit();//to save the details after inserting.
//	        
	       
	        //
	        
	     // Retrieve entity

	        employee = em.find(Employee.class, 10);
//
        System.out.println(employee);
//	        
//	        
//	        
//	        
//	        //
//	        
//	        etrans.begin();
//	        //employee.setAddress("blore");
//
//	        System.out.println("Updated Employee is: " + employee);
//
//	        em.getTransaction().commit();
//	        
//	        
//	        
	        employee = new Employee("klmnnn",122.0f);
	        etrans.begin();
	        em.merge(employee);
	        
	        em.getTransaction().commit();
//	        
	        System.out.println("Merged :"+employee);
		}
//		
//		
		
		}

