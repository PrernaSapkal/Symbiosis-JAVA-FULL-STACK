package com.symbi.faculty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	kbp obj = new kbp();
    	obj.setId(1);
    	obj.setName("prerna");
    	obj.setSalary(10000);
    	obj.setJoindate(new Date());
    	obj.setDept("cse");
    	
    	FileInputStream fs = new FileInputStream("src/main/java/images (2).jpeg");
    	byte img[] = new byte[fs.available()];
        //	obj.setImg(img);
    	
    	   Certifications certi = new Certifications();
    	   certi.setTech("java");
           certi.setCertiName("coursera");
           obj.setCerti(certi);
    	
//    	
//     SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//     Session sn = factory.getCurrentSession()  ;
//     Transaction ts = sn.beginTransaction();
//     sn.save(obj);
//     System.out.println("done");
//     ts.commit();
//     sn.close();
//          
          
           // set  data
           
//         SessionFactory factory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//         Session sn = factory.openSession();
//         kbp kbp1=sn.get(kbp.class, 1);
//         System.out.println(obj.getName());
//         sn.close();
          
           //update data
           
//           SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//           Session session = factory.openSession();
//           Transaction transaction = session.beginTransaction();
//           kbp kbp1 = session.get(kbp.class,1);
//           obj.setName("xyz");
//           session.save(obj);
//           transaction.commit();
//           session.close();
           
           SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
           Session session = factory.openSession();
           Transaction transaction = session.beginTransaction();
           kbp kbp1= session.get(kbp.class, 2);
           System.out.println("deleted");
           session.delete(kbp1);
           
           session.save(obj);
          
           transaction.commit();
           session.close();           
           
         
         
         
          
           
       
    }
}
