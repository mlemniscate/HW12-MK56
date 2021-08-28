package ir.maktab.base.service.impl;

import ir.maktab.base.domain.Person;
import ir.maktab.base.repository.PersonRepository;
import ir.maktab.base.service.BaseEntityService;

import java.io.Serializable;

public abstract class PersonServiceImpl<E extends Person<ID>, ID extends Serializable, R extends PersonRepository<E, ID>>
        extends BaseEntityServiceImpl<E, ID, R>
        implements BaseEntityService<E, ID> {

    public PersonServiceImpl(R repository) {
        super(repository);
    }
}
