package com.csi.service;

import com.csi.model.Employee;

public interface EmployeeService{
        public  void signup(Employee employee);

        public boolean signin(String empEmailId,String empPassword);
}

