package com.Emp_App_Dao.Impl;

import java.sql.Connection;
import java.util.List;

import com.Emp_App_Dao.DeptDAO;
import com.Emp_App_Dto.Dept;
import com.Emp_App_Utility.Connector;


public class DeptDAOImpl implements DeptDAO {
    
    private Connection con;
	
	public DeptDAOImpl() {
		this.con=Connecter.requestConnection();
		}
	
	@Override
	public void addDept(Dept t) {
		String query="Insert into dept values (0,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,t.getDname());
			ps.setString(2,t.getLocation());
			ps.executeUpdate();
			System.out.println("Dept data added succecfully:");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to data!");
		}

	}

	@Override
	public Dept findById(Dept d) {
		
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
