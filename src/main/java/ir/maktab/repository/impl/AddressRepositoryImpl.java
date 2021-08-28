package ir.maktab.repository.impl;

import ir.maktab.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.domain.Address;
import ir.maktab.repository.AddressRepository;

import javax.persistence.EntityManager;

public class AddressRepositoryImpl extends BaseEntityRepositoryImpl<Address, Long> implements AddressRepository {

    public AddressRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Address> getEntityClass() {
        return Address.class;
    }
}
