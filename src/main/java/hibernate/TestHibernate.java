package hibernate; 
 
import hibernate.*; 
import org.hibernate.Session; 
 
public class TestHibernate { 
 
    public static void main(String[] args) { 
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction(); 
 
        CarEntity car = new CarEntity(); 
        car.setCarName("audi"); 
        car.setCarModel("rs7"); 
 
        session.save(car); 
 
        session.getTransaction().commit(); 
        HibernateUtil.shutdown(); 
    } 
} 