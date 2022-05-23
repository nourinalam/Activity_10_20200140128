package com.example.activity9.model;

public class Teman {

    // Variable String yg sama pada DBController
    String id,nama,telpon;

    public Teman() {
    }

    public Teman(String id, String nama, String telpon) {
        this.id = id;
        this.nama = nama;
        this.telpon = telpon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }
}

