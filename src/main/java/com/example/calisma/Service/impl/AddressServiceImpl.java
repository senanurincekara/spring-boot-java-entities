package com.example.calisma.Service.impl;


import com.example.calisma.Repository.IAddressRepository;
import com.example.calisma.Service.IAddressService;
import com.example.calisma.dto.DtoAddress;
import com.example.calisma.dto.DtoCustomer;
import com.example.calisma.entities.Address;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private IAddressRepository addressRepo;

    @Override
    public DtoAddress findAddressById(Long id) {
        Optional<Address> optional= addressRepo.findById(id);

        if(optional.isEmpty()){
            return null;
        }

        Address address = optional.get();

        DtoAddress dtoAddress = new DtoAddress();
        BeanUtils.copyProperties(address,dtoAddress);

        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());

        dtoAddress.setCustomer(dtoCustomer);
        return dtoAddress;
    }
}
