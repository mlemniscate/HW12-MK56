package ir.maktab.base.repository.impl;

import ir.maktab.base.domain.Person;
import ir.maktab.base.repository.PersonRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class PersonRepositoryImpl<E extends Person<ID>, ID extends Serializable>
        extends BaseEntityRepositoryImpl<E, ID>
        implements PersonRepository<E, ID> {

    public PersonRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }
}
