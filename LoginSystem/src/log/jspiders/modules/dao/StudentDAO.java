package log.jspiders.modules.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.singleton.SingletonFactory;

import log.jspiders.modules.dto.StudentDTO;

public class StudentDAO {

	SessionFactory  factory=SingletonFactory.getFactory();
	public StudentDAO()
	{
	 System.out.println(this.getClass().getSimpleName()+ " object created");	
	}
	
	public void insertValues(StudentDTO e)
	{
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		System.out.println("Sucessfully inserted");
	

    }
	
	public StudentDTO getItemByEmail(String email,String password) 
	{
		System.out.println("getting item by email method started");
		String hql="from StudentDTO s where s.password='"+password+"'and s.email='"+email+"'";
		
		Session session=factory.openSession();
		Query query=session.createQuery(hql);
		StudentDTO itemFromDb=(StudentDTO) query.uniqueResult();	
		
		return itemFromDb;
	}
}
