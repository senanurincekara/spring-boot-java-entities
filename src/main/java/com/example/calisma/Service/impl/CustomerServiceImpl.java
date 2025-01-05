package com.example.calisma.Service.impl;

import com.example.calisma.Repository.CustomerRepository;
import com.example.calisma.Service.ICustomerService;
import com.example.calisma.dto.DtoAddress;
import com.example.calisma.dto.DtoCustomer;
import com.example.calisma.entities.Address;
import com.example.calisma.entities.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl  implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepo;


    @Override
    public DtoCustomer findCustomerById(Long id) {

        Optional<Customer> optional= customerRepo.findById(id);

        if(optional.isEmpty()){
            return null;
        }

        Customer customer = optional.get();
        Address address = optional.get().getAddress();

        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();

        BeanUtils.copyProperties(customer,dtoCustomer );
        BeanUtils.copyProperties(address,dtoAddress );

        dtoCustomer.setAddress(dtoAddress);
        return dtoCustomer ;
    }
}
