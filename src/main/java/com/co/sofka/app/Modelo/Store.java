package com.co.sofka.app.Modelo;

import java.security.Timestamp;

public class Store {
    private int id;
    private Staff staff;
    private Address address;
    private Timestamp lastUpdate;

    public Store(int id, Staff staff, Address address, Timestamp lastUpdate) {
        this.id = id;
        this.staff = staff;
        this.address = address;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
