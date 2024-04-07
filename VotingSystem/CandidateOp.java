package com.Vote.VotingSystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CandidateOp {
	static Scanner sc=new Scanner(System.in);
	static Candidate cd = new Candidate();
	public static void candidateAdd()
	{
		System.out.println("enter candidate id");
		int cId=sc.nextInt();		
		System.out.println("enter candidate name");
		String cName=sc.next();
		
	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	   Session session = factory.getCurrentSession();
	   Transaction transaction = session.beginTransaction();
	   cd.setcId(cId);
	   cd.setcName(cName);
	   session.save(cd);
	   transaction.commit();
	   session.close();
	   factory.close();		
	}
	public static void candidateUpdate()
	{
		System.out.println("enter candidate id to update");
		int cId=sc.nextInt();		
		System.out.println("enter new candidate name");
		String cName=sc.next();
		   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		   Session session = factory.getCurrentSession();
		   Transaction transaction = session.beginTransaction();
		   Candidate cnd = session.get(Candidate.class, transaction);
		   cd.setcId(cId);
		   cd.setcName(cName);
		   session.save(cd);
		   transaction.commit();
		   session.close();
		   factory.close();	
	}
	public static void candidateDelete()
	{
		System.out.println("enter candidate id to delete");
		int cId=sc.nextInt();	
		   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		   Session session = factory.getCurrentSession();
		   Transaction transaction = session.beginTransaction();
		   Candidate cnd = session.get(Candidate.class, transaction);
		   session.delete(cnd);
		   transaction.commit();
		   session.close();
		   factory.close();	
		   
	}
	
}


