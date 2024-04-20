package com.example.laboratorio3.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Table(name = "employees")
@Entity
public class Employees {

    @Id
    private Integer employee_id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "hire_date")
    private String hireDate;
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Column(name = "salary")
    private float salary;
    @Column(name = "commission_pct")
    private float commissionPct;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employees manager;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    @Column(name = "enabled")
    private boolean enable;

}
