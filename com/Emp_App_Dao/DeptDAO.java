package com.Emp_App_Dao;

import java.util.List;

import com.Emp_App_Dto.Dept;


public interface DeptDAO {
    void addDept(Dept t);
    
    Dept findById(Dept d);
    
    List<Dept> findAll();
    
    void updateDept(Dept d);
    
    void deleteDept(Integer dno);
}
