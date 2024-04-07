package com.Vote.VotingSystem;

import java.util.Scanner;

public class VoterTest {

	static Scanner sc = new Scanner(System.in);
	public static void voterDetails()
	{
		System.out.println(" press 1 for add voter\n press 2 for update voter \n press 3 for delete voter \n press 4 to vote ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			VoterOp.voterAdd();
			break;
		case 2:
			VoterOp.voterUpdate();
		    break;
		case 3:
			VoterOp.voterUpdate();
			break;
		case 4:
			VoterOp.toVote();
			break;
			
			
		}
	
	}


}
