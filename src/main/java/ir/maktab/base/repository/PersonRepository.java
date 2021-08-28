package ir.maktab.base.repository;

import ir.maktab.base.domain.Person;

import java.io.Serializable;

public interface PersonRepository<E extends Person<ID>, ID extends Serializable> extends BaseEntityRepository<E, ID> {
}
