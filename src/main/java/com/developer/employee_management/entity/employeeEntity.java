package com.developer.employee_management.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="mt_employee")
public class employeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "address")
    private String address;

    public employeeEntity() {

    }

    public employeeEntity(Long id, String name, String gender, Date dob, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
