package com.patterns.creational.builder;

public class CarBuilder {

    private String color;
    private String potency;
    private String brand;


    //optional
    private String automaticTransmissionType;
    private String turboPressure;


    public CarBuilder(String color, String potency, String brand, String automaticTransmissionType, String turboPressure) {
        this.color = color;
        this.potency = potency;
        this.brand = brand;
        this.automaticTransmissionType = automaticTransmissionType;
        this.turboPressure = turboPressure;
    }

    public CarBuilder() {
    }

    public CarBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public CarBuilder setPotency(String potency){
        this.potency = potency;
        return this;
    }

    public CarBuilder setBrand(String brand){
        this.brand = brand;
        return this;
    }

    public CarBuilder setAutomaticTransmissionType(String automaticTransmissionType){
        this.automaticTransmissionType = automaticTransmissionType;
        return this;
    }

    public CarBuilder setTurboPressure(String turboPressure){
        this.turboPressure = turboPressure;
        return this;
    }

    public Car build(){
        return new Car(color, potency, brand, automaticTransmissionType, turboPressure);
    }
}
