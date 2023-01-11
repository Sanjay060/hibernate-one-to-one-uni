package com.p1.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.p1.demo.entity.Instructor;
import com.p1.demo.entity.InstructorDetail;

public class DeleteInstructor {

	public static void main(String[]args)
	{
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernate-example1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		try
		{
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Instructor i=new Instructor();
			InstructorDetail iu=new InstructorDetail();
			i.setInstructorDeatil(iu);
			entityTransaction.begin();
			int id=2;
			Instructor instructor=entityManager.find(Instructor.class,id);
			System.out.println("found instructor: "+instructor);
			if(instructor !=null)
			{
				System.out.println("deleting: "+instructor);
				entityManager.remove(instructor);
				System.out.println("delted...");
			}
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
