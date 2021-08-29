package ir.maktab.domain;

import ir.maktab.base.domain.Person;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student extends Person<Long> {

    public static final String TABLE_NAME = "students";
    public static final String STUDENT_CODE = "student_code";

    @Column(name = STUDENT_CODE)
    private String studentCode;

    @ManyToMany
    @JoinTable(
            name = "student_has_teacher",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private Set<Teacher> teachers;

    public Student() {
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
