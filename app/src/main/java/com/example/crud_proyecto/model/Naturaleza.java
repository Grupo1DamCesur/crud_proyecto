package com.example.crud_proyecto.model;

import java.util.List;

public class Naturaleza {
    private String uid;
    private String name;
    private String category;
    private String descripcion;
    private String telefono;
    private String web;
    private String mail;
    private double latitude;
    private double longitude;
    private String ciudad;
    private List<String> fotoUrl;

    public Naturaleza(){

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<String> getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(List<String> fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    @Override
    public String toString() {
        return name;
    }
}
