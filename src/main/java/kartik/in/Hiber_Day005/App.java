package kartik.in.Hiber_Day005;
import kartik.in.Hiber_Day005.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 


 

public class App 
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");

		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student s=new Student(1,"Kartika","Nagpur");
		session.save(s);
		//session.delete(s);
		
		tx.commit();
		session.close();
	}
	
}
