package com.cloud.gcp.cloudsql.Request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmployeeCreationRequest {
    @NotNull(message = "name must not be null")
    private String name;
    @NotNull(message = "salary must not be null")
    private int sal;
}
