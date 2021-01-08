package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

	
	
	//@Entity
	public class BankAccount  implements Serializable{
		
		
		 /**
		 * 
		 */
		private static final long serialVersionUID = -192925064596904614L;
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		 @Column(name = "account_Number", nullable = false)
		private String accountNo;
		 @Column(name = "location", nullable = false)
		private String location;
		 @Column(name = "bank_name", nullable = false)
		private String bankName;
		 
		// @ManyToOne
		 //@JoinColumn(name="emp_id",nullable=false)
		// private Employee employee;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getAccountNo() {
			return accountNo;
		}

		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		/*
		 * public Employee getEmployee() { return employee; }
		 * 
		 * public void setEmployee(Employee employee) { this.employee = employee; }
		 */
		 

}
