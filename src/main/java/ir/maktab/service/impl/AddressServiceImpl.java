package ir.maktab.service.impl;

import ir.maktab.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.domain.Address;
import ir.maktab.repository.AddressRepository;
import ir.maktab.service.AddressService;

public class AddressServiceImpl extends BaseEntityServiceImpl<Address, Long, AddressRepository> implements AddressService {

    public AddressServiceImpl(AddressRepository repository) {
        super(repository);
    }
}
