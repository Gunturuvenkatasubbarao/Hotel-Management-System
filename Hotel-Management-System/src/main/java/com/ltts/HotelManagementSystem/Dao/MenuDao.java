package com.ltts.HotelManagementSystem.Dao;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ltts.HotelManagementSystem.model.Booking;
import com.ltts.HotelManagementSystem.model.Member;
import com.ltts.HotelManagementSystem.model.Menu;
@Repository
public class MenuDao {
	@Autowired
	private EntityManager em;
	@Autowired
	private SessionFactory sf;
	public boolean InsertMenu(Menu f) {
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			s.save(f);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
		finally {
			sf.close();
		}
		
		return b;
	}
	public List<Menu> getAllMenu(){
		Session session=sf.openSession();
        session.beginTransaction();
        
        List<Menu> li=sf.openSession().createCriteria(Booking.class).list();
		session.getTransaction().commit();
		return li;
		
	}
	
}
