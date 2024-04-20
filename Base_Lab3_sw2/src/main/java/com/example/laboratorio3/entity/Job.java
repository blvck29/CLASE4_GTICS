package com.example.laboratorio3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @Column(name = "job_id", nullable = false)
    private String jobId;
    @Column(name = "job_title", nullable = false)
    private String jobTitle;
    @Column(name = "min_salary")
    private Integer minSalary;
    @Column(name = "max_salary")
    private Integer maxSalary;

}
