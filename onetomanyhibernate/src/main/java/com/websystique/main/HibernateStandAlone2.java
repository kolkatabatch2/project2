package com.websystique.main;
 
import java.util.ArrayList;
import java.util.List;
 
import org.hibernate.Session;
 
import com.websystique.hibernate.model.Address;
import com.websystique.hibernate.model.Student;
 
public class HibernateStandAlone2 {
     
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
 
    	Address address1 = new Address("10 Silver street","NYC","USA");
    	Address address2 = new Address("20 MG Road","Bangalore","India"); 
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student st=(Student)session.get(Student.class,1L);
        List<Address> addresses=new ArrayList<Address>();
        addresses.add(address1);
        addresses.add(address2);
        st.setAddress(addresses);
        session.persist(address1);
        session.persist(address2);
 
      
        session.getTransaction().commit();
        session.close();  
    }
 
}
