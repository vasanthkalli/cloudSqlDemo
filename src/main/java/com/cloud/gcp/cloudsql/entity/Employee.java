package com.cloud.gcp.cloudsql.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Employee {

    @Column
    private int sal;
    @Column
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
