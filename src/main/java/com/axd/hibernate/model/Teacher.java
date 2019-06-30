package com.axd.hibernate.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Teacher {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_seq_gen")
  @SequenceGenerator(name ="teacher_seq_gen", sequenceName = "teacher_sequence")


    private Long id;
    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "hire_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;

    @Column(name = "salary")
    private Double salary;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


}
