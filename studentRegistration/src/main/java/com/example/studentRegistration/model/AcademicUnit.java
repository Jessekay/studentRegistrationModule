package com.example.studentRegistration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class AcademicUnit {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    @JsonManagedReference
    private List<Student> student;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courseName")
    @JsonManagedReference
    private List<Course> courses;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teachers")
    @JsonManagedReference
    private List<Teacher> teachers;

    @OneToMany()
    private List<StudentRegistration> studentRegistrations;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent")
    private List<AcademicUnit> academicUnits;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private AcademicUnit academicUnit;
    
    private EAcademicUnit eAcademicUnit;
    
    private String code;
    private String name;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AcademicUnit(List<Student> student, String code, String name) {
        this.student = student;
        this.code = code;
        this.name = name;
    }
    
}
