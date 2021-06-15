package Demo.com.Hib_Demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	Data objData = new Data();
    	
		//Insart A data In Data Base
    	
    	  DataName an = new DataName();
    	  an.setFname("Kiarn");
    	  an.setMname("Ravindra");
    	  an.setLname("Chaudhari");
    	  
		  objData.setAid(100); 
		  objData.setAname(an); 
		  objData.setAcolour("Black-Wight");
		 
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Data.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(objData);
    	
    	//objData = (Data) session.get(Data.class, 101); Fetching A Data In Data Base Using Id
    	
    	tx.commit();	
    	System.out.println(objData);
    }
}

