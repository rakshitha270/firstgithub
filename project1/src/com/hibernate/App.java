package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.project1.User;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

Session session = factory.getCurrentSession();

try {
// Create object of entity class type
User user = new User( 3, "Rakshi","Naik","sshah@tns.org");
// Start transaction
session.beginTransaction();
// Perform operation
Session.save(User);


// Commit the transaction 
session.getTransaction().commit();
System.out.println("Row Added");


} finally {
session.close();
factory.close();
}

}
}

