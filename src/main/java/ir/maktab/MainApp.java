package ir.maktab;

import com.github.javafaker.Faker;
import ir.maktab.domain.Student;
import ir.maktab.util.HibernateUtil;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.Locale;
import java.util.stream.IntStream;

public class MainApp {
    public static void main(String[] args) {
        EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();

    }

    public static void enterStudents(EntityManager entityManager) {
        Faker faker = new Faker(new Locale("tr"));
        IntStream.range(1, 50).forEach(item -> {
            Student student = new Student();
            student.setFirstName(faker.name().firstName());
            student.setLastName(faker.name().lastName());
            student.setBirthday(new Date(faker.date().birthday().getTime()));
            student.setStudentCode(faker.code().asin());
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        });
    }
}
