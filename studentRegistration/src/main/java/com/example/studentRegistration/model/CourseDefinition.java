package com.example.studentRegistration.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class CourseDefinition {
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @JsonBackReference

    private String code;
    private String name;
    private String description;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public CourseDefinition(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }
    
}
