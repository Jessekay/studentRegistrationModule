package com.example.studentRegistration.model;

import javax.persistence.ManyToMany;

public class CourseDefinition {
    private String code;
    @ManyToMany
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
}
