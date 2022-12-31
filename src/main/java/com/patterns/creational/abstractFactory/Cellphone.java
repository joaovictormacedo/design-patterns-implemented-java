package com.patterns.creational.abstractFactory;

import java.math.BigDecimal;

public class Cellphone extends Product {

    @Override
    public String getSpecifications() {
        return "Cell Phone specifications!";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(100);
    }
}
