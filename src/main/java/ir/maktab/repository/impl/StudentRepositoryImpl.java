package ir.maktab.repository.impl;

import ir.maktab.base.repository.impl.PersonRepositoryImpl;
import ir.maktab.domain.Student;
import ir.maktab.repository.StudentRepository;

import javax.persistence.EntityManager;

public class StudentRepositoryImpl extends PersonRepositoryImpl<Student, Long> implements StudentRepository {

    public StudentRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Student> getEntityClass() {
        return Student.class;
    }
}
