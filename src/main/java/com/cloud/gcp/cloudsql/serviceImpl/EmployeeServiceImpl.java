package com.cloud.gcp.cloudsql.serviceImpl;

import com.cloud.gcp.cloudsql.Request.EmployeeCreationRequest;
import com.cloud.gcp.cloudsql.entity.Employee;
import com.cloud.gcp.cloudsql.repository.CloudSqlEmployeeRepo;
import com.cloud.gcp.cloudsql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private CloudSqlEmployeeRepo employeeRepo;

   // private static Map<Long, Object> repo = new HashMap<>();

    @Override
    public Employee saveEmployee(EmployeeCreationRequest request) {
        Employee emp = new Employee();
        emp.setName(request.getName());
        emp.setSal(request.getSal());
        employeeRepo.save(emp);
//        repo.put(emp.getId(), emp);
        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
//       List<Employee> emps =  repo.entrySet().stream().map(Map.Entry::getValue)
//               .map(obj -> (Employee)obj).collect(Collectors.toList());
//       return emps;
    }
}
