package ir.maktab.repository.impl;

import ir.maktab.base.repository.impl.PersonRepositoryImpl;
import ir.maktab.domain.Teacher;
import ir.maktab.repository.TeacherRepository;

import javax.persistence.EntityManager;

public class TeacherRepositoryImpl extends PersonRepositoryImpl<Teacher, Long> implements TeacherRepository {

    public TeacherRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Teacher> getEntityClass() {
        return Teacher.class;
    }
}
