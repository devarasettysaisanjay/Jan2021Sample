package com.example.demo.pojo;

import java.util.List;

public class EmployeeDetails {
	
	
	private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    
  //  private List<EmpBankDetails> bankEmpDetails  =null;
    
    
	/*
	 * public List<EmpBankDetails> getBankEmpDetails() { return bankEmpDetails; }
	 * public void setBankEmpDetails(List<EmpBankDetails> bankEmpDetails) {
	 * this.bankEmpDetails = bankEmpDetails; }
	 */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + "]";
	}
    


}
