package com.Emp_App_Dao.Impl;

import java.sql.Connection;
import java.util.List;

import com.Emp_App_Dao.EmployeeDAO;
import com.Emp_App_Dto.Employee;
import com.Emp_App_Utility.Connector;

public class EmployeeDAOImpl implements EmployeeDAO {
   
	
	 private Connection con;
		
		public EmployeeDAOImpl(Connection con) {
			this.con=Connector.requestConnection();
			}
		
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findByMailAndPassword(String mail, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub

	}

}
