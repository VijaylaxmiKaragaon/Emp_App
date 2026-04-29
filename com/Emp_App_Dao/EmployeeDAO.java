package com.Emp_App_Dao;

import java.util.List;

import com.Emp_App_Dto.Employee;


public interface EmployeeDAO {
	
	
   void addEmployee(Employee e); //create
	
	Employee findById(Integer id); //read
	
	List<Employee> findAll(); //read
	
	Employee findByMailAndPassword(String mail,String password); //read
	
	void updateEmployee(Employee e); //update
	
	Employee deleteEmployee(Integer id); //delete
}
