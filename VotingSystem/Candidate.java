package com.Vote.VotingSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Candidate {
	@Id
	
	
	private int cId;
	private String cName;
	@Override
	public String toString() {
		return "Candidate [cId=" + cId + ", cName=" + cName + "]";
	}
	public Candidate(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	public Candidate() {
		super();
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	

}
