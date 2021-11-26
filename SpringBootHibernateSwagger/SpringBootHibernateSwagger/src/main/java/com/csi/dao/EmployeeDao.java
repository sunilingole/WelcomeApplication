package com.csi.dao;

import com.csi.model.Employee;

public interface EmployeeDao {
    public  void signup(Employee employee);

    public boolean signin(String empEmailId,String empPassword);
}
