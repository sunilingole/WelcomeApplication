package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
@PostMapping("/signUp")
    public String signup(@RequestBody Employee employee){
    employeeService.signup(employee);
    return "Signup Dta Successfully";
}
@GetMapping("/signIn/{empEmailId}/{empPassword}")
    public  boolean signin(@PathVariable String empEmailId,@PathVariable String empPassword){
   return employeeService.signin(empEmailId ,empPassword);



}


}
