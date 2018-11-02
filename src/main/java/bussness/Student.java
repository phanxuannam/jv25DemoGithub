/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussness;

/**
 *
 *this is student class
 */
public class Student {
    private int studentId;
    private String studentName;
    String bath;

    public Student() {
    }

    public Student(int studentId, String studentName, String bath) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.bath = bath;
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

   

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
}
