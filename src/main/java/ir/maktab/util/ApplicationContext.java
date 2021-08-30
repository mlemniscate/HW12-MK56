package ir.maktab.util;

import ir.maktab.repository.AddressRepository;
import ir.maktab.repository.StudentRepository;
import ir.maktab.repository.TeacherRepository;
import ir.maktab.repository.impl.AddressRepositoryImpl;
import ir.maktab.repository.impl.StudentRepositoryImpl;
import ir.maktab.repository.impl.TeacherRepositoryImpl;
import ir.maktab.service.AddressService;
import ir.maktab.service.StudentService;
import ir.maktab.service.TeacherService;
import ir.maktab.service.impl.AddressServiceImpl;
import ir.maktab.service.impl.StudentServiceImpl;
import ir.maktab.service.impl.TeacherServiceImpl;

import javax.persistence.EntityManager;

public class ApplicationContext {
    private static final AddressRepository ADDRESS_REPOSITORY;
    private static final AddressService ADDRESS_SERVICE;
    private static final StudentRepository STUDENT_REPOSITORY;
    private static final StudentService STUDENT_SERVICE;
    private static final TeacherRepository TEACHER_REPOSITORY;
    private static final TeacherService TEACHER_SERVICE;

    private ApplicationContext() {
    }

    static {
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
        ADDRESS_REPOSITORY = new AddressRepositoryImpl(entityManager);
        ADDRESS_SERVICE = new AddressServiceImpl(ADDRESS_REPOSITORY);
        STUDENT_REPOSITORY = new StudentRepositoryImpl(entityManager);
        STUDENT_SERVICE = new StudentServiceImpl(STUDENT_REPOSITORY);
        TEACHER_REPOSITORY = new TeacherRepositoryImpl(entityManager);
        TEACHER_SERVICE = new TeacherServiceImpl(TEACHER_REPOSITORY);
    }
}

