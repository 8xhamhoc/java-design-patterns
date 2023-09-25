package org.quangphan.java.design.patterns.decorator_pattern.coffee;

public class MilkDecorator implements CoffeeDecorator {

    protected Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.2;
    }

    @Override
    public String description() {
        return coffee.description() + ", Milk";
    }
}
