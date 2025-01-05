package com.example.calisma.Service;

import com.example.calisma.dto.DtoCustomer;

public interface ICustomerService {


    public DtoCustomer findCustomerById(Long id);
}
