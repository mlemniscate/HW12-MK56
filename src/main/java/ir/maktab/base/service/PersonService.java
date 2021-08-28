package ir.maktab.base.service;

import ir.maktab.base.domain.Person;

import java.io.Serializable;

public interface PersonService<E extends Person<ID>, ID extends Serializable> extends BaseEntityService<E, ID> {
}
