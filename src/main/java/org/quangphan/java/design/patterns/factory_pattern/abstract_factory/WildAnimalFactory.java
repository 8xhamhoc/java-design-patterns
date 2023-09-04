package org.quangphan.java.design.patterns.factory_pattern.abstract_factory;

public class WildAnimalFactory extends AnimalFactory {

    @Override
    Dog createDog() {
        return new WildDog();
    }

    @Override
    Tiger createTiger() {
        return new WildTiger();
    }
}
