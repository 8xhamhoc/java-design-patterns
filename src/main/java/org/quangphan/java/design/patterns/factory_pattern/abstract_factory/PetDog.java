package org.quangphan.java.design.patterns.factory_pattern.abstract_factory;

public class PetDog implements Dog {
    @Override
    public void showName() {
        System.out.println("This is Pet dog");
    }
}
