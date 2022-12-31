package com.patterns.creational.abstractFactory;

import java.math.BigDecimal;

public class Notebook extends Product {


    @Override
    public String getSpecifications() {
        return "Notebook specifications!";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1000);
    }
}
