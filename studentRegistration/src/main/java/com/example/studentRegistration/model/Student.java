package com.example.studentRegistration.model;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Student {
    @ManyToOne
    private AcademicUnit department;
    @JoinColumn(name = "fk_department")
    @JsonBackReference("unit-student")

    @OneToMany(mappedBy = "register")
    private StudentRegistration register;
    @JoinColumn(name = "fk_register")
    @JsonBackReference
    
    private String regNumber;
    private String firstName;
    private String dateOfBirth;

    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Student(AcademicUnit department, StudentRegistration register, String regNumber, String firstName,
            String dateOfBirth) {
        this.department = department;
        this.register = register;
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }
}
