package com.Emp_App_Dao.Impl;

import java.sql.Connection;
import java.util.List;

import com.Emp_App_Dao.DeptDAO;
import com.Emp_App_Dto.Dept;
import com.Emp_App_Utility.Connector;


public class DeptDAOImpl implements DeptDAO {

	
	 private Connection con;
		
		public DeptDAOImpl(Connection con) {
			this.con=Connector.requestConnection();
			}
		
		
	@Override
	public void addDept(Dept t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findById(Dept d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDept(Dept d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDept(Integer dno) {
		// TODO Auto-generated method stub

	}

}
