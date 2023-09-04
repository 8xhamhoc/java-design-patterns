package org.quangphan.java.design.patterns.factory_pattern.simlpe_factory;

public class ConcreteProductB implements  Product {

    @Override
    public void doSomething() {
        System.out.println("B says hello");
    }
}
