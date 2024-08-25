package com.cloud.gcp.cloudsql.service;

import com.cloud.gcp.cloudsql.Request.EmployeeCreationRequest;
import com.cloud.gcp.cloudsql.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(EmployeeCreationRequest request);

    public List<Employee> getAllEmployees();
}
