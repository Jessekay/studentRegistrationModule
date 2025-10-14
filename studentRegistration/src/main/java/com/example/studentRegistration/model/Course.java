package com.example.studentRegistration.model;

public class Course {
    private String id;
    private String code;
    private String name;
    private String description;
    private String credits;
    private String semesterId;
    private String teacherId;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    public String getCredits() {
        return credits;
    }
    public void setCredits(String credits) {
        this.credits = credits;
    }
    public String getSemesterId() {
        return semesterId;
    }
    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }
    public String getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public Course(String id, String code, String name, String description, String credits, String semesterId,
            String teacherId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.semesterId = semesterId;
        this.teacherId = teacherId;
    }

    
}
