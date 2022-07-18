package com.example.rentservice.model;

import customer.Customer;
import rent.Rent;
import vehicle.Vehicle;

public class DetailResponse implements Responce{

    Rent rent;
    Customer customer;
    Vehicle vehicle;

    public DetailResponse(Rent rent, Customer customer, Vehicle vehicle) {
        this.rent = rent;
        this.customer = this.customer;
        this.vehicle = this.vehicle;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
