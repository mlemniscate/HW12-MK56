package ir.maktab.domain;

import ir.maktab.base.domain.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student extends Person<Long> {

    public static final String TABLE_NAME = "students";
    public static final String STUDENT_CODE = "student_code";

    @Column(name = STUDENT_CODE)
    private String studentCode;

    public Student() {
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
