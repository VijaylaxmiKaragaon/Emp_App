package com.Emp_App_Dao.Impl;

import java.sql.Connection;
import java.util.List;

import com.Emp_App_Dao.EmployeeDAO;
import com.Emp_App_Dto.Employee;
import com.Emp_App_Utility.Connector;

private Connection con;
	
	public EmployeeDAOImpl() {
		this.con=Connecter.requestConnection();
	}
	@Override
	public void addEmployee(Employee e) {
			
		try {
			String query = "insert into employee values (0,?,?,?,?,SYSDATE(),?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, e.getName());
			ps.setString(2, e.getJob());
			ps.setDouble(3, e.getSal());
			ps.setInt(4, e.getDno());
			ps.setString(5, e.getMail());
			ps.setString(6, e.getPassword());
			ps.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Failed to add the data");
		}
		

	}

	@Override
	public Employee findById(Integer id) {
		String query="SELECT * FROM EMPLOYEE WHERE ID=?";
		Employee e=null;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				e=new Employee();
				e.setId(rs.getInt("Id"));
				e.setName(rs.getString("Name"));
				e.setJob(rs.getString("JOB"));
				e.setSal(rs.getDouble("sal"));
				e.setDno(rs.getInt("Dno"));
				e.setPassword(rs.getString("password"));
				e.setCreatedAt(rs.getString("created_at"));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("failed to fetch the data....");
		}
		
		return e;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> eList=new ArrayList<>();
		String query="select * from employee";
		Employee e=null;
				try {
					PreparedStatement ps=con.prepareStatement(query);
					ResultSet rs=ps.executeQuery();
					while(rs.next()) {
						e=new Employee();
						e.setId(rs.getInt("id"));
						e.setName(rs.getString("name"));
						e.setJob(rs.getString("JOB"));
						e.setSal(rs.getDouble("sal"));
						e.setDno(rs.getInt("Dno"));
						e.setPassword(rs.getString("password"));
						e.setCreatedAt(rs.getString("created_at"));
						eList.add(e);
					}	
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		        
		return eList;
	}

	@Override
	public Employee findByMailAndPassword(String mail, String password) {
		String query = "select * from employee where mail=? and password=?";
		Employee e=null;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, mail);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				e=new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setJob(rs.getString("JOB"));
				e.setSal(rs.getDouble("sal"));
				e.setDno(rs.getInt("Dno"));
				e.setCreatedAt(rs.getString("created_at"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return e;
	}

	@Override
	public void updateEmployee(Employee e) {
//		String query="update employee set name=?, job=?, sal=?, dno=? where id=?";
//		Employee e=null;
//		PreparedStatement ps=con.prepareStatement(query);
//		

	}

	@Override
	public Employee deleteEmployee(Integer id) {
		String query="delete from employee where id=?";
		Employee e=null;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("Employee deleted succesfully");
			} else {
				System.out.println("no employee found with given id");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return e;

	}


