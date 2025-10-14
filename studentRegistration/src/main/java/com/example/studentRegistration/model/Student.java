package com.example.studentRegistration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Student {
    @OneToMany(mappedBy = "register")
    private List <StudentRegistration> register;
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
    public Student() {
    }
    public Student(List<StudentRegistration> register, String regNumber, String firstName, String dateOfBirth) {
        this.register = register;
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }
    
    
}
