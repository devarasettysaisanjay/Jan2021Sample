package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.example.demo.entity.BankAccount;
import com.example.demo.entity.Employee;
import com.example.demo.pojo.EmpBankDetails;
import com.example.demo.pojo.EmployeeDetails;
import com.example.demo.repo.EmployeeRepo;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	
	public Employee processEmployeeDetails(EmployeeDetails employeeDetails) {
		Employee e = new Employee();
	//	Employee e1 = new Employee();
		e.setEmailId(employeeDetails.getEmailId());
		e.setFirstName(employeeDetails.getFirstName());
		e.setLastName(employeeDetails.getLastName());
//		List<BankAccount> al = new ArrayList<>();
//		for (EmpBankDetails empDet : employeeDetails.getBankEmpDetails()) {
//			BankAccount acc = new BankAccount();
//			//acc.setId(empDet.get);
//			acc.setAccountNo(empDet.getAccountNo());
//			acc.setBankName(empDet.getBankName());
//			acc.setLocation(empDet.getLocation());
//			acc.setEmployee(e);
//			al.add(acc);
//
//		}
//        e.setBankAccount(al);
		return empRepo.saveAndFlush(e);
		

	}

    // @CachePut(value="updateEmp",key="#employee")
	public int updateEmployee(EmployeeDetails employee) {
		Optional<Employee> emp = empRepo.findById(employee.getId());
		if (null != emp.get())
			return empRepo.updateEmployee(employee.getId(), employee.getEmailId());
		return 0;
	}

	
	@Cacheable(value = "employees",key="#id")
	public Employee getEmployee(Long id) {
		Optional<Employee> emp= empRepo.findById(id);
		return emp.get();
	}

	
	
}
