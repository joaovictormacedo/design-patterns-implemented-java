package com.patterns.creational.abstractFactory;

public class Main {

    /**
     * Abstract Factory Defines an interface for creating a family of related or dependent objects,
     * without specifying the implementations of concrete classes.
     * It encapsulates the choice of concrete classes that will be used in the creation of objects of different families.
     * The client code will have no knowledge of the concrete type,
     * the concrete objects will be created by the factory and the client code will access those objects through the interface.
     */

    public static void main(String[] args) {

        Product notebook = ProductFactory.getProduct(new NotebookFactory());
        System.out.println(notebook.getSpecifications());
        System.out.println("Notebook price: "+ notebook.getPrice());

        Product cellphone = ProductFactory.getProduct(new CellPhoneFactory());
        System.out.println(cellphone.getSpecifications());
        System.out.println("Cellphone price: "+ cellphone.getPrice());


    }

}
