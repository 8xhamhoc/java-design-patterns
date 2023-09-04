package org.quangphan.java.design.patterns.factory_pattern.simlpe_factory;

public class ProductFactory {

    public static Product getInstance(String instance) {
        if ("A".equals(instance)) {
            return new ConcreteProductA();
        } else if ("B".equals(instance)) {
            return new ConcreteProductB();
        }
        throw new IllegalArgumentException();
    }
}
