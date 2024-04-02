package com.symbi.faculty;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
@Entity
public class kbp {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
@Transient
	private double salary;
	
@Temporal(TemporalType.DATE)
	private Date joindate;
	
	private String dept;
@Lob
@Column(name="img",length=10000)
	private byte[] img;

	private Certifications certi;


	public String toString() {
		return "kbp [id=" + id + ", name=" + name + ", salary=" + salary + ", joindate=" + joindate + ", dept=" + dept
				+ ", img=" + Arrays.toString(img) + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public kbp(int id, String name, double salary, Date joindate, String dept, byte[] img) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joindate = joindate;
		this.dept = dept;
		this.img = img;
	}

	public kbp() {
		super();
	}

	public void setCertifications(Certifications certi2) {
		// TODO Auto-generated method stub
		
	}

	public Certifications getCerti() {
		return certi;
	}

	public void setCerti(Certifications certi) {
		this.certi = certi;
	}

	

	
	
	
	
	
	
}
