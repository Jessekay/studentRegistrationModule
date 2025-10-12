package com.example.studentRegistration.model;

import java.time.LocalDate;

public class StudentRegistration {
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
