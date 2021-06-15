package Demo.com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;


public class App 
{
    public static void main( String[] args )
    {

    	Laptop laptop = new Laptop();
    	laptop.setLid(102);
    	laptop.setLname("Dell");
    	
    	Student s = new Student();
    	s.setName("Ram");
    	s.setRollno(25);
    	s.setMarks(66);
    	s.getLaptop().add(laptop);

    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf = con.buildSessionFactory(registry);
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(laptop);
    	session.save(s);
    	
    	session.getTransaction().commit();
    	
    	//System.out.println(laptop);
    }
}

