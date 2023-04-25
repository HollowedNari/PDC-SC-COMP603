/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc.sc.comp603;

/**
 *
 * @author eh155
 */
public class Teacher extends QnALogIn {
    
        private String teacherName;
        private String classCode;

    public Teacher(String teacherName, String classCode) {
        this.teachertName = teacherName;
        this.classCode = classCode;
    }

    public String getStudentName() {
        return teacherName;
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
