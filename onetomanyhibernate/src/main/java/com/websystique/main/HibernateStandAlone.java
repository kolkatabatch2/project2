package com.websystique.main;
 
import java.util.List;
 
import org.hibernate.Session;
 
import com.websystique.hibernate.model.Address;
import com.websystique.hibernate.model.Student;
 
public class HibernateStandAlone {
     
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
 
        Student student = new Student("Sam","Disilva","Maths");
          
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
       
        session.persist(student);
 
      
        session.getTransaction().commit();
        session.close();  
    }
 
}
