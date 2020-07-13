package com.ncu.car_manage.pojo;


public class Car {
    int id;
    String brand;
    String color;
    int sites;
    float fuelConsumption;
    int dailyRent;
    String addPerson;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSites() {
        return sites;
    }

    public void setSites(int sites) {
        this.sites = sites;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(int dailyRent) {
        this.dailyRent = dailyRent;
    }

    public String getAddPerson() {
        return addPerson;
    }

    public void setAddPerson(String addPerson) {
        this.addPerson = addPerson;
    }
}
