package ir.maktab.domain;

import ir.maktab.base.domain.Person;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = Teacher.TABLE_NAME)
public class Teacher extends Person<Long> {

    public static final String TABLE_NAME = "teachers";
    public static final String TEACHER_CODE = "teacher_code";
    public static final String SALARY = "salary";

    @Column(name = TEACHER_CODE)
    private String teacherCode;

    @Column(name = SALARY)
    private Double salary;

    @ManyToMany(mappedBy = "teachers")
    private Set<Student> students;
    public Teacher() {
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
