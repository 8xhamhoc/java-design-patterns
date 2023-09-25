package org.quangphan.java.design.patterns.decorator_pattern.coffee;

public class PlainCoffee implements Coffee {

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Plain Coffee";
    }
}
