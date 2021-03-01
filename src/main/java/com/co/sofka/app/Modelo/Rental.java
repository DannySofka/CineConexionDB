package com.co.sofka.app.Modelo;

import java.security.Timestamp;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Rental {
    private int id;
    private SimpleDateFormat rentalDate;
    private Inventory inventory;
    private Customer customer;
    private Staff staff;
    private Timestamp lastUpdate;

    public Rental(int id, SimpleDateFormat rentalDate, Inventory inventory, Customer customer, Staff staff, Timestamp lastUpdate) {
        this.id = id;
        this.rentalDate = rentalDate;
        this.inventory = inventory;
        this.customer = customer;
        this.staff = staff;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SimpleDateFormat getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(SimpleDateFormat rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
