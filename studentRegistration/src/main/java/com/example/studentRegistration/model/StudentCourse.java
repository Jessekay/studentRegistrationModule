package com.example.studentRegistration.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class StudentCourse {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentCourse")
    private Course course;
    @JsonBackReference

    private int credits;
    private BigDecimal results;
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public BigDecimal getResults() {
        return results;
    }
    public void setResults(BigDecimal results) {
        this.results = results;
    }
    public StudentCourse(int credits, BigDecimal results) {
        this.credits = credits;
        this.results = results;
    }
    
}
