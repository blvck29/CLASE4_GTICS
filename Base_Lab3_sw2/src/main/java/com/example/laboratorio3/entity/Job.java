package com.example.laboratorio3.entity;

import javax.persistence.*;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    private String jobId;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "min_salary")
    private Integer minSalary;
    @Column(name = "max_salary")
    private Integer maxSalary;

}
