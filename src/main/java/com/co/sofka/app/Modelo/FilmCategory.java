package com.co.sofka.app.Modelo;

import java.security.Timestamp;

public class FilmCategory {
    private short id;
    private Category category;
    private Timestamp lastUpdate;

    public FilmCategory(short id, Category category, Timestamp lastUpdate) {
        this.id = id;
        this.category = category;
        this.lastUpdate = lastUpdate;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
