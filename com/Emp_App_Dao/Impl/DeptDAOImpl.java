package com.Emp_App_Dao.Impl;

import java.sql.Connection;
import java.util.List;

import com.Emp_App_Dao.DeptDAO;
import com.Emp_App_Dto.Dept;
import com.Emp_App_Utility.Connector;


public class DeptDAOImpl implements DeptDAO {
    
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
			e.printStackTrace();
			System.out.println("Failed to data!");
		}

	}

	@Override
	public Dept findById(Integer dno) {
		String query="SELECT * FROM Dept WHERE Dno=?";
		Dept t=null;
		try {
			PreparedStatement ps=con.prepareStatement(query);
          	ps.setInt(1, dno);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				t=new Dept();
				t.setDno(rs.getInt("dno"));
				t.setDname(rs.getString("dname"));
				t.setLocation(rs.getNString("location"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return t;
	}

	@Override
	public List<Dept> findAll() {
		List<Dept> dList=new ArrayList<>();
		String query="select * from dept";
		Dept t=null;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				t=new Dept();
				t.setDno(rs.getInt("dno"));
				t.setDname(rs.getString("dname"));
				t.setLocation(rs.getString("location"));
				dList.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dList;
	}

	@Override
	public void updateDept(Dept d) {
		String query="update dept set dname=?,location=? where dno=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, d.getDname());
			ps.setString(2, d.getLocation());
			ps.setInt(3, d.getDno());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Dept deleteDept(Integer dno) {
		String query="delete from dept where dno=?";
		Dept t=null;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, dno);
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("Dept deleted successfully!");
			}else {
				System.out.println("no dept found with given dno");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return t;
	}

}
}