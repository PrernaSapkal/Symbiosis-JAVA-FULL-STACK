package com.Employees;

public class Employees {
private int EmpId;
private String name;
private String salary;
 public void setEmpId(int EmpId)
 {
	 this.EmpId=EmpId;
 }
 public int getEmpId()
 {
	 return EmpId;
 }
 public void setName(String name)
 {
	 this.name=name;
 }
 public String getName()
 {
	 return name;
 }
 public void setSalary(String salary)
 {
	 this.salary=salary;
 }
 public String getSaalary()
 {
	 return salary;
 }
 public static void main(String args[])
 {
	 Employees obj = new Employees();
	 obj.setEmpId(90);
	 obj.setName("xyz");
	 obj.setSalary("100000");
	 System.out.println(obj);
	 System.out.println(obj.getEmpId()+" "+obj.getEmpId()+" "+obj.salary);
	 
	 
 }
public String toString() {
	return "Employees [EmpId=" + EmpId + ", name=" + name + ", salary=" + salary + "]";
}
}
