package com.example.studentRegistration.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class StudentRegistration {
    @ManyToOne
    @JoinColumn(name = "fk_register")
    private Student register;
    @JsonManagedReference

    @ManyToOne
    private AcademicUnit academicUnit;
    @JoinColumn(name = "registration")
    @JsonBackReference

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentRegistration")
    private List<StudentCourse> studentCourses;
    @JsonManagedReference

    @ManyToOne
    private Semester semester;
    @JoinColumn(name = "semCourse")
    @JsonBackReference

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
