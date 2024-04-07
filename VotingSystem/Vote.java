package com.Vote.VotingSystem;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.ManyToOne;

	@Entity
	public class Vote {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToOne
	    private Voter voter;

	    @ManyToOne
	    private Candidate candidate;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Voter getVoter() {
			return voter;
		}

		public void setVoter(Voter voter) {
			this.voter = voter;
		}

		public Candidate getCandidate() {
			return candidate;
		}

		public void setCandidate(Candidate candidate) {
			this.candidate = candidate;
		}

		public Vote(int id, Voter voter, Candidate candidate) {
			super();
			this.id = id;
			this.voter = voter;
			this.candidate = candidate;
		}

		public Vote() {
			super();
		}

	 
	 
	}



