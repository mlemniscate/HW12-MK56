package ir.maktab.domain;

import ir.maktab.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student extends BaseEntity<Long> {

    public static final String TABLE_NAME = "students";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String TEACHER_CODE = "teacher_code";
    public static final String SALARY = "salary";
    public static final String BIRTHDAY = "birthday";

    @Column(name = FIRST_NAME)
    private String firstName;

    @Column(name = LAST_NAME)
    private String lastName;

    @Column(name = TEACHER_CODE)
    private String teacherCode;

    @Column(name = SALARY)
    private Double salary;

    @Column(name = BIRTHDAY)
    private LocalDate birthday;
}
