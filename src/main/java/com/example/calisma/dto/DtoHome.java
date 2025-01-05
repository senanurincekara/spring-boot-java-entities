package com.example.calisma.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DtoHome {
    private Long id;
    private BigDecimal price;
    private List<DtoRoom> rooms = new ArrayList<>() ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<DtoRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<DtoRoom> rooms) {
        this.rooms = rooms;
    }
}
