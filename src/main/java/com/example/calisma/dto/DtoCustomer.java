package com.example.calisma.dto;

public class DtoCustomer {

    private Long id;
    private String name;

    private DtoAddress address;

    // / /////////////////

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DtoAddress getAddress() {
        return address;
    }

    public void setAddress(DtoAddress address) {
        this.address = address;
    }
}
