package com.example.calisma.Controller.impl;

import com.example.calisma.Controller.IHomeController;
import com.example.calisma.Service.IHomeService;
import com.example.calisma.dto.DtoHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/home")
public class HomeControllerImpl implements IHomeController {

    @Autowired
    private IHomeService homeService;


    @GetMapping(path = "/{id}")
    @Override
    public DtoHome findHomeById(@PathVariable(name = "id") Long id) {
        return homeService.findHomeById(id); 
    }
}
