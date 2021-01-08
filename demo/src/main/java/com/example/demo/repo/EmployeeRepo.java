package com.example.demo.repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Long>{
	
	
	public Optional<Employee> findById(Long id);
	
	@Modifying
	@Transactional
	@Query("Update Employee e  set e.emailId= :email  where e.id=:id")
	public int updateEmployee(@Param("id") Long id,@Param("email") String email);
	
	

}
