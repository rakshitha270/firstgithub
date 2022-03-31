package com.cg.jpastart.entities;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class OnetoOneBiDirectional {

		public static void main(String[] args) {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			
			Student student = new Student();
			student.setName("Sharath");
			
			Address mainaddress = new Address();
			mainaddress.setArea("kb road");
			mainaddress.setCity("kadur");
			mainaddress.setState("Karnataka");
			mainaddress.setPinCode("577548");
			
			student.setAddress(mainaddress);
			em.persist(student);
			em.getTransaction().commit();
			
			System.out.println("One to One Bi-Directional Association is added in database");
			em.close();
			factory.close();
		}

	
}
