package com.example.calisma.dto;

public class DtoAddress {

    private Long id;
    private String description;

    private DtoCustomer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DtoCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(DtoCustomer customer) {
        this.customer = customer;
    }
}
