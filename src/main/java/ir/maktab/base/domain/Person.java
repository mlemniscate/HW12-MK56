package ir.maktab.base.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
public class Person<ID extends Serializable> extends BaseEntity<ID>{
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String BIRTHDAY = "birthday";

    @Column(name = FIRST_NAME)
    private String firstName;

    @Column(name = LAST_NAME)
    private String lastName;

    @Column(name = BIRTHDAY)
    private LocalDate birthday;
}
