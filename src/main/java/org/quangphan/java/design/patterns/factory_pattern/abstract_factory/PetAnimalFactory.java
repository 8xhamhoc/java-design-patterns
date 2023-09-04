package org.quangphan.java.design.patterns.factory_pattern.abstract_factory;

public class PetAnimalFactory extends AnimalFactory {

    @Override
    Dog createDog() {
        return new PetDog();
    }

    @Override
    Tiger createTiger() {
        return new PetTiger();
    }
}
