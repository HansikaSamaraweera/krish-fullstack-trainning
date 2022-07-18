package com.example.rentservice.model;

import rent.Rent;

public class SimpleResponse implements Responce{
    Rent rent;


    public SimpleResponse(Rent rent) {
        this.rent = rent;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
