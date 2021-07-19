package com.cn.online_exam.pojo;

import java.io.Serializable;

public class Student implements Serializable {

    private Integer studentID;
    private String account;
    private String password;
    private Integer grade;

    public Student(Integer studentID, String account, String password, Integer grade) {
        this.studentID = studentID;
        this.account = account;
        this.password = password;
        this.grade = grade;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", grade=" + grade +
                '}';
    }
}
