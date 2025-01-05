package com.example.calisma.Service;

import com.example.calisma.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
