package ir.maktab.domain;

import ir.maktab.base.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = Address.TABLE_NAME)
public class Address extends BaseEntity<Long> {

    public static final String TABLE_NAME = "addresses";
    public static final String NUMBER = "number";
    public static final String STATE = "state";
    public static final String CITY = "city";
    public static final String POSTAL_ADDRESS = "postal_address";
    public static final String POSTAL_CODE = "postal_code";

    @Column(name = NUMBER, nullable = false)
    private String number;
    @Column(name = STATE)
    private String state;
    @Column(name = CITY)
    private String city;
    @Column(name = POSTAL_ADDRESS)
    private String postalAddress;
    @Column(name = POSTAL_CODE)
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public Address() {
    }

    public Address(String number, String state, String city, String postalAddress, String postalCode) {
        this.number = number;
        this.state = state;
        this.city = city;
        this.postalAddress = postalAddress;
        this.postalCode = postalCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
