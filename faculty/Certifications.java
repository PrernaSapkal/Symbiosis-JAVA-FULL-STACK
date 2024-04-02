package com.symbi.faculty;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certifications {

	private String tech;
	private String certiName;
	
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getCertiName() {
		return certiName;
	}
	public void setCertiName(String certiName) {
		this.certiName = certiName;
	}
	
	
}
