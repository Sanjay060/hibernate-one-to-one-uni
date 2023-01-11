package com.p1.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.p1.demo.entity.Instructor;
import com.p1.demo.entity.InstructorDetail;

public class CreateInstructor {

	public static void main(String[] args) {
//		SessionFactory factory=new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Instructor.class)
//				.addAnnotatedClass(InstructorDetail.class)
//				.buildSessionFactory();
//		Session session=factory.getCurrentSession();
//		try
//		{
//			System.out.println("creating new instructor");
//			Instructor i=new Instructor("abhi","c","abhi@gmail.com");
//			InstructorDetail iu=new InstructorDetail("english","dollu");
//			//linking two objects by setter method nextline//
//			i.setInstructorDeatil(iu);
//			session.beginTransaction();
//			System.out.println("saving instructor: "+i);
//			session.save(i);
//			System.out.println("done!");
//			session.getTransaction().commit();
//		}
//		finally
//		{
//			factory.close();
//		}
		//using Persistence file and EntityManagerFactory//
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-example1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			Instructor i=new Instructor("kruthik","bs","kruthik@gmail.com");
			InstructorDetail iu=new InstructorDetail("java","eating");
			i.setInstructorDeatil(iu);
			entityTransaction.begin();
			//to save the object to database//
			entityManager.persist(i);
			//Instructor instructor = entityManager.find(Instructor.class, 2);
			//instructor.setFirstname("shashank");
			//to update merge is used//
			//entityManager.merge(instructor);
			System.out.println(i);
			entityTransaction.commit();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			entityManager.close();
		}
		

	}

}
