package com.example.studentRegistration.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class StudentRegistration {
    @ManyToOne(cascade = CascadeType.ALL)
    private Student register;
    @JsonManagedReference

    @ManyToOne(cascade = CascadeType.ALL)
    private AcademicUnit academicUnit;
    @JoinColumn(name = "registration")

    private String studentId;
    private LocalDate registrationDate;
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    public StudentRegistration() {
    }
    public StudentRegistration(Student register, String studentId, LocalDate registrationDate) {
        this.register = register;
        this.studentId = studentId;
        this.registrationDate = registrationDate;
    }
    
    
}
