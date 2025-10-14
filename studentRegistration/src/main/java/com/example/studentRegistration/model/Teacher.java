package com.example.studentRegistration.model;

public class Teacher {
    private String code;
    private String names;
    private String qualifications;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getNames() {
        return names;
    }
    public void setNames(String names) {
        this.names = names;
    }
    public String getQualifications() {
        return qualifications;
    }
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
    public Teacher(String code, String names, String qualifications) {
        this.code = code;
        this.names = names;
        this.qualifications = qualifications;
    }
}
