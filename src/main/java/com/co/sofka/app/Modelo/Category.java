package com.co.sofka.app.Modelo;

import java.security.Timestamp;

public class Category {
    private int id;
    private String categoryName;
    private Timestamp lastUpdate;

    public Category() {
        this.id = id;
        this.categoryName = categoryName;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
