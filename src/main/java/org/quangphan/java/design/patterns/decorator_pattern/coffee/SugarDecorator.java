package org.quangphan.java.design.patterns.decorator_pattern.coffee;

public class SugarDecorator implements CoffeeDecorator {

    protected Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    public String description() {
        return coffee.description() + ", Sugar";
    }
}
