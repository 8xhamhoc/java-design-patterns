package org.quangphan.java.design.patterns.factory_pattern.simlpe_factory;

public class ConcreteProductA implements Product {

    @Override
    public void doSomething() {
        System.out.println("A says hello");
    }
}
