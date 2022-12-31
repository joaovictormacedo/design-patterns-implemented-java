package com.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        Car fiatUno = new CarBuilder().setBrand("FIAT UNO").setColor("RED").setPotency("1.0").build();
        System.out.println("My first car is "+fiatUno.getBrand()+ " of color "+fiatUno.getColor());

        Car lamborghini = new CarBuilder()
                .setBrand("Lamborghini Aventador")
                .setColor("ORANGE")
                .setPotency("6.5")
                .setAutomaticTransmissionType("7-speed")
                .setTurboPressure("8 psi")
                .build();
        System.out.println("My second car is "+lamborghini.getBrand()+ " of color "+lamborghini.getColor() +
                " with automatic transmission "+lamborghini.getAutomaticTransmissionType() + " and "
                + lamborghini.getTurboPressure() +" of turbo pressure! ");

    }
}
