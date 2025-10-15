package com.example.studentRegistration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class AcademicUnit {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courseName")
    @JsonManagedReference
    private List<Course> courses;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "academicUnit")
    @JsonManagedReference
    private List<StudentRegistration> studentRegistrations;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent")
    private List<AcademicUnit> academicUnits;
    @JsonManagedReference

    @ManyToOne
    @JoinColumn(name = "parentId")
    private AcademicUnit academicUnit;
    @JsonBackReference
    
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
    public AcademicUnit(List<Course> courses, List<StudentRegistration> studentRegistrations,
            List<AcademicUnit> academicUnits, AcademicUnit academicUnit, EAcademicUnit eAcademicUnit, String code,
            String name) {
        this.courses = courses;
        this.studentRegistrations = studentRegistrations;
        this.academicUnits = academicUnits;
        this.academicUnit = academicUnit;
        this.eAcademicUnit = eAcademicUnit;
        this.code = code;
        this.name = name;
    }
    
    
}
