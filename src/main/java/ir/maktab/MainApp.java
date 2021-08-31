package ir.maktab;

import com.github.javafaker.Faker;
import ir.maktab.domain.Student;
import ir.maktab.domain.Teacher;
import ir.maktab.util.ApplicationContext;
import ir.maktab.util.HibernateUtil;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.stream.IntStream;

public class MainApp {
    public static void main(String[] args) {
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
//        enterStudentsTeachers(entityManager);
//        enterStudentsTeachers(entityManager);
//        enterStudentsTeachers(entityManager);
        System.out.println(ApplicationContext.getStudentService().existsById(13L));
    }

    private static void enterAddresses() {
    }

    public static void enterStudentsTeachers(EntityManager entityManager) {
        Faker faker = new Faker();
        Teacher teacher1 = teacherCreate(faker);
        Teacher teacher2 = teacherCreate(faker);
        IntStream.range(1, 10).forEach(item -> {
            Student student = new Student();
            student.setFirstName(faker.name().firstName());
            student.setLastName(faker.name().lastName());
            student.setBirthday(new Date(faker.date().birthday().getTime()));
            student.setStudentCode(faker.code().asin());
            student.getTeachers().add(teacher1);
            student.getTeachers().add(teacher2);
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        });
    }

    private static Teacher teacherCreate(Faker faker) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(faker.name().firstName());
        teacher.setLastName(faker.name().lastName());
        teacher.setBirthday(new Date(faker.date().birthday().getTime()));
        teacher.setSalary(faker.number().randomDouble(2, 500, 5000));
        teacher.setTeacherCode(faker.code().ean8());
        return teacher;
    }
}
