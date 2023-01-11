package com.p1.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

import com.p1.demo.entity.Instructor;
import com.p1.demo.entity.InstructorDetail;

public class UpdateInstructor {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hibernate-example1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		try
		{
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Instructor i=new Instructor();
			InstructorDetail iu=new InstructorDetail();
			i.setInstructorDeatil(iu);
			entityTransaction.begin();
			int id=3;
			Instructor instructor=entityManager.find(Instructor.class,id);
			instructor.setLastname("bannur");
			entityManager.merge(instructor);
			System.out.println("updated....");
			entityTransaction.commit();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			entityManager.close();
		}

	}

}
