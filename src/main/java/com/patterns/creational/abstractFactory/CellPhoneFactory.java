package com.patterns.creational.abstractFactory;

public class CellPhoneFactory implements ProductAbstractFactory {
    @Override
    public Product create() {
        return new Cellphone();
    }
}
