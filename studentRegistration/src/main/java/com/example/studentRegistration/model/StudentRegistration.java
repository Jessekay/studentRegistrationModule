package com.example.studentRegistration.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class StudentRegistration {
    @ManyToOne
    private List<Student> register;
    @JsonManagedReference

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
}
