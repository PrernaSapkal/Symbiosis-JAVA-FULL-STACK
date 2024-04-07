package com.Vote.VotingSystem;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" press 1 for candidate details\n press 2 for voter details");
        int ch = sc.nextInt();
       
        switch(ch)
        {
        case 1:
        	CandidateTest.candidateDetails();
        	break;
        case 2:
        	VoterTest.voterDetails();
        	break;
        
        }  
    }
}
