package com.patterns.creational.abstractFactory;

public class ProductFactory {

    public static Product getProduct(ProductAbstractFactory factory) {
        return factory.create();
    }
}
