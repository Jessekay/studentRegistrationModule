package com.example.studentRegistration.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Course {
    @ManyToOne
    private Student enrollCourse;
    @JsonBackReference

    @ManyToOne
    private Semester courseSemester;
    @JoinColumn(name = "coursesPerSem")
    @JsonBackReference

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
    private List<StudentCourse> studentCourse;
    @JsonManagedReference

    @ManyToMany
    @JoinTable(name = "trCourse", joinColumns = @JoinColumn(name = "courseTeacher"),
    inverseJoinColumns = @JoinColumn(name = "teacherId"))
    private List<Teacher> courseTeachers;

    @ManyToMany
    @JoinTable(name = "academicUnit", joinColumns = @JoinColumn(name = "academicId"),
    inverseJoinColumns = @JoinColumn(name = "fk_academic"))

    @OneToMany(cascade = CascadeType.ALL)
    private List<CourseDefinition> courseDefinitions;
    @JsonManagedReference

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
    public Course() {
    }
    public Course(Semester courseSemester, List<StudentCourse> studentCourse, List<Teacher> courseTeachers, String id,
            String code, String name, String description, String credits, String semesterId, String teacherId) {
        this.courseSemester = courseSemester;
        this.studentCourse = studentCourse;
        this.courseTeachers = courseTeachers;
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.semesterId = semesterId;
        this.teacherId = teacherId;
    }
    
    
}
