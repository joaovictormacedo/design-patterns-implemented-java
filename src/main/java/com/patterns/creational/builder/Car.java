package com.patterns.creational.builder;

public class Car {

    private String color;
    private String potency;
    private String brand;


    //optional
    private String automaticTransmissionType;
    private String turboPressure;

    public Car(String color, String potency, String brand, String automaticTransmissionType, String turboPressure) {
        this.color = color;
        this.potency = potency;
        this.brand = brand;
        this.automaticTransmissionType = automaticTransmissionType;
        this.turboPressure = turboPressure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPotency() {
        return potency;
    }

    public void setPotency(String potency) {
        this.potency = potency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAutomaticTransmissionType() {
        return automaticTransmissionType;
    }

    public void setAutomaticTransmissionType(String automaticTransmissionType) {
        this.automaticTransmissionType = automaticTransmissionType;
    }

    public String getTurboPressure() {
        return turboPressure;
    }

    public void setTurboPressure(String turboPressure) {
        this.turboPressure = turboPressure;
    }
}
