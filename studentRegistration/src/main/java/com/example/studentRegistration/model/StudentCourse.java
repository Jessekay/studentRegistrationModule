package com.example.studentRegistration.model;

import java.math.BigDecimal;

public class StudentCourse {
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
}
