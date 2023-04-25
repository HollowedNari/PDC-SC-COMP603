/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc.sc.comp603;

/**
 *
 * @author eh155
 */
public class Student extends QnALogIn{
    
    private String studentName;
    private String classCode;

    public Student(String studentName, String classCode) {
        this.studentName = studentName;
        this.classCode = classCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
    
    
    
    
    
    
    
}
