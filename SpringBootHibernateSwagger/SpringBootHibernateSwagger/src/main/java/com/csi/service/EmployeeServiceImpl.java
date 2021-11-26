package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDao employeeDao;
    @Override
    public void signup(Employee employee) {
        employeeDao.signup(employee);
    }

    @Override
    public boolean signin(String empEmailId, String empPassword) {
        return employeeDao.signin(empEmailId,empPassword);
    }
}
