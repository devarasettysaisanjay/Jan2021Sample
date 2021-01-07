package com.example.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Employee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -653938397812055780L;
	private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    
   
    private List<BankAccount> bankAccount=new ArrayList<>();
    

    
   // @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,orphanRemoval = true)
	/*
	 * public List<BankAccount> getBankAccount() { return bankAccount; }
	 * 
	 * 
	 * 
	 * public void setBankAccount(List<BankAccount> bankAccount) { this.bankAccount
	 * = bankAccount; }
	 */



	public Employee() {

    }

   

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


}
