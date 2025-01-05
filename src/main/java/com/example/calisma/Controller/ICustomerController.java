package com.example.calisma.Controller;

import com.example.calisma.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);

}
