package com.Vote.VotingSystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VoterOp {
	static Voter obj1=new Voter();
	static Scanner sc = new Scanner(System.in);
	public static void voterAdd()
	{
		System.out.println("enter voter id");
		int voterId=sc.nextInt();		
		System.out.println("enter voter name");
		String voterName=sc.next();
		
	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	   Session session = factory.getCurrentSession();
	   Transaction transaction = session.beginTransaction();
	   
	   obj1.setVoterId(voterId);
	   obj1.setVoterName(voterName);
	   session.save(obj1);
	   transaction.commit();
	   session.close();
	   factory.close();		
	}
	public static void voterUpdate()
	{
		   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		   Session session = factory.getCurrentSession();
		   Transaction transaction = session.beginTransaction();
		   System.out.println("enter voter id to update");
		   int voterId=sc.nextInt();
			System.out.println("enter new voter name");
			String voterName=sc.next();
		   Voter voterToUpdate=session.get(Voter.class, voterId);
		   System.out.println(voterToUpdate);
		   voterToUpdate.setVoterName(voterName);
		   session.save(voterToUpdate);
		   transaction.commit();
		   session.close();
		   factory.close();
		   
	}
	public static void deleteVoter()
	{
	    System.out.println("enter voter id to delete");
		int voterId=sc.nextInt();
		
	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	   Session session = factory.getCurrentSession();
	   Transaction transaction = session.beginTransaction();
	   Voter voterToDelete = session.get(Voter.class, voterId);
	   session.delete(voterToDelete);
	   transaction.commit();
	   session.close();
	   factory.close();
	
	}
	public static void toVote() {
	    System.out.println("Enter voter id:");
	    int voterId = sc.nextInt();
	    System.out.println("Enter candidate id:");
	    int candidateId = sc.nextInt();

	    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session session = factory.getCurrentSession();
	    Transaction transaction = session.beginTransaction();

	    Voter voter = session.get(Voter.class, voterId);
	    Candidate candidate = session.get(Candidate.class, candidateId);

	    	        Vote vote = new Vote();
	    	        vote.setVoter(voter);
	    	        vote.setCandidate(candidate);
	    	        session.save(vote);
	        System.out.println("Vote successfuly");

	    transaction.commit();
	    session.close();
	    factory.close();
	

	}

}
