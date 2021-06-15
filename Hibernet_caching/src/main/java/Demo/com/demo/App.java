package Demo.com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	Data a = null;
		 
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Data.class);
    	//ServiceRegistry reg =new StandardServiceRegistryBuilder().applySettings(con.getProperties()).getBootstrapServiceRegistry();
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session session1 = sf.openSession();
    	session1.beginTransaction();
    	
    	a = (Data) session1.get(Data.class, 101);
    	System.out.println(a);
    	session1.getTransaction().commit();
    	
    	//objData = (Data) session.get(Data.class, 101); Fetching A Data In Data Base Using Id
    	
    	
    }
}

