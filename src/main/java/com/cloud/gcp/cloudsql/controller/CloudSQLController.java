package com.cloud.gcp.cloudsql.controller;

import com.cloud.gcp.cloudsql.Request.EmployeeCreationRequest;
import com.cloud.gcp.cloudsql.entity.Employee;
import com.cloud.gcp.cloudsql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CloudSQLController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody EmployeeCreationRequest request) {

       return employeeService.saveEmployee(request);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
