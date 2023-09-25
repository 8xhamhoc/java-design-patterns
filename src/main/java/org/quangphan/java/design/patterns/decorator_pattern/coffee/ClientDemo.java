package org.quangphan.java.design.patterns.decorator_pattern.coffee;

public class ClientDemo {

    public static void main(String[] args) {

        Coffee plainCoffee = new PlainCoffee();
        System.out.println("Plain coffee: " + plainCoffee.cost());
        plainCoffee.description();

        MilkDecorator milkDecorator = new MilkDecorator(plainCoffee);
        System.out.println("Milk coffee: " + milkDecorator.cost());
        milkDecorator.description();

        SugarDecorator sugarDecorator = new SugarDecorator(plainCoffee);
        System.out.println("Sugar coffee: " + sugarDecorator.cost());
        sugarDecorator.description();
    }
}
