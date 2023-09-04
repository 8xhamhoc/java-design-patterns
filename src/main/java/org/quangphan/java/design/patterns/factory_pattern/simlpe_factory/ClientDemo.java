package org.quangphan.java.design.patterns.factory_pattern.simlpe_factory;

public class ClientDemo {

    public static void main(String[] args) {
        Product a = ProductFactory.getInstance("A");
        Product b = ProductFactory.getInstance("B");

        a.doSomething();
        b.doSomething();
    }
}
