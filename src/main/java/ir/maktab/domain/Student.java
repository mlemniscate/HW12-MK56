package ir.maktab.domain;

import ir.maktab.base.domain.Person;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student extends Person<Long> {

    public static final String TABLE_NAME = "students";
    public static final String STUDENT_CODE = "student_code";

    @Column(name = STUDENT_CODE)
    private String studentCode;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(
            name = "student_has_teacher",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private Set<Teacher> teachers = new HashSet<>();

    public Student() {
    }

    public Student(String firstName, String lastName, Date birthday, String studentCode) {
        super(firstName, lastName, birthday);
        this.studentCode = studentCode;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
