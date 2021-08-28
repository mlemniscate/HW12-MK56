package ir.maktab.service.impl;

import ir.maktab.base.service.impl.PersonServiceImpl;
import ir.maktab.domain.Teacher;
import ir.maktab.repository.TeacherRepository;
import ir.maktab.service.TeacherService;

public class TeacherServiceImpl extends PersonServiceImpl<Teacher, Long, TeacherRepository> implements TeacherService {

    public TeacherServiceImpl(TeacherRepository repository) {
        super(repository);
    }
}
