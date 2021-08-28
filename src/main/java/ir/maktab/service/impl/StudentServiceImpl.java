package ir.maktab.service.impl;

import ir.maktab.base.service.impl.PersonServiceImpl;
import ir.maktab.domain.Student;
import ir.maktab.repository.StudentRepository;
import ir.maktab.service.StudentService;

public class StudentServiceImpl extends PersonServiceImpl<Student, Long, StudentRepository> implements StudentService {

    public StudentServiceImpl(StudentRepository repository) {
        super(repository);
    }
}
