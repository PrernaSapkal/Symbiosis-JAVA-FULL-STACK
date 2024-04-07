package com.Vote.VotingSystem;

import java.util.Scanner;

public class CandidateTest {
	static Scanner sc = new Scanner(System.in);
	public static void candidateDetails()
	{
		System.out.println(" press 1 for add candidate\n press 2 for update vcandidate \n press 3 for delete candidate");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			CandidateOp.candidateAdd();
			break;
		case 2:
			CandidateOp.candidateUpdate();
		    break;
		case 3:
			CandidateOp.candidateDelete();
			break;
		}
	
	}

}
