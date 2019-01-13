package com.websystique.main;
 
import java.util.List;
 
import org.hibernate.Session;
 
import com.websystique.hibernate.model.Address;
import com.websystique.hibernate.model.Student;
 
public class HibernateStandAlone3 {
     
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
 
    	
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student st=(Student)session.get(Student.class,1L);
        
        session.delete(st);
 
      
        session.getTransaction().commit();
        session.close();  
    }
 
}
