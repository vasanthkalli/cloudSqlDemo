package com.cloud.gcp.cloudsql.repository;

import com.cloud.gcp.cloudsql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudSqlEmployeeRepo extends JpaRepository<Employee, Integer> {
}
