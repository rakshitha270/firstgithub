package com.cg.jpastart.entities;


	

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class Client {
		public static void main(String[] args) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em=factory.createEntityManager();
			em.getTransaction().begin();
			Student student=new Student();
			student.setName("Rakshitha");
			Address address2=new Address();
			address2.setCity("bangalore");
			address2.setState("karnataka");
			address2.setStreet("KM road");
			address2.setZipcode(17);
			student.setAddress(address2);
			em.persist(student);
			em.getTransaction().commit();
			System.out.println("good added one to one");
			em.close();
			factory.close();
		}

	}

