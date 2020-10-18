package com.myspace.loan;
import java.util.Date;
import java.util.concurrent.TimeUnit; 
 

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.Double salary;
	private int age;
	private int amount;
	private int iScore;
	private java.lang.Boolean approve;
	private java.lang.String responseName;

	private java.util.Date birthdate;

	public Applicant() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Double getSalary() {
		return this.salary;
	}

	public void setSalary(java.lang.Double salary) {
		this.salary = salary;
	}

	public int getAge() {
	    Date curentDate = new Date();  
        long difference_In_Time = curentDate.getTime() - birthdate.getTime(); 
        long difference_In_Days = TimeUnit .MILLISECONDS .toDays(difference_In_Time)  % 365; 
        long difference_In_Monthes = TimeUnit .MILLISECONDS .toDays(difference_In_Time)  % 12; 
        long difference_In_Years = TimeUnit .MILLISECONDS .toDays(difference_In_Time) / 365l; 
        this.age = (int) difference_In_Years ;
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getiScore() {
		return this.iScore;
	}

	public void setiScore(int iScore) {
		this.iScore = iScore;
	}

	public java.lang.Boolean getApprove() {
		return this.approve;
	}

	public void setApprove(java.lang.Boolean approve) {
		this.approve = approve;
	}

	public java.lang.String getResponseName() {
		return this.responseName;
	}

	public void setResponseName(java.lang.String responseName) {
		this.responseName = responseName;
	}

	public java.util.Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(java.util.Date birthdate) {
		this.birthdate = birthdate;
	}

	public Applicant(java.lang.String name, java.lang.Double salary, int age,
			int amount, int iScore, java.lang.Boolean approve,
			java.lang.String responseName, java.util.Date birthdate) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.amount = amount;
		this.iScore = iScore;
		this.approve = approve;
		this.responseName = responseName;
		this.birthdate = birthdate;
	}

}