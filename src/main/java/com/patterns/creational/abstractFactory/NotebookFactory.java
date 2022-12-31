package com.patterns.creational.abstractFactory;

public class NotebookFactory implements ProductAbstractFactory {
    @Override
    public Product create() {
        return new Notebook();
    }
}
