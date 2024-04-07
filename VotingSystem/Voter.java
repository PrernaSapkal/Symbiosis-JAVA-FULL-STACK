package com.Vote.VotingSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Voter {
	@Id
	private int voterId;
	private String voterName;
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", voterName=" + voterName + "]";
	}
	public Voter(int voterId, String voterName) {
		super();
		this.voterId = voterId;
		this.voterName = voterName;
	}
	public Voter() {
		super();
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	
	
	

}
