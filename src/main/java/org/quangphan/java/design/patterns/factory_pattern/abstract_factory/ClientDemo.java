package org.quangphan.java.design.patterns.factory_pattern.abstract_factory;

public class ClientDemo {

    public static void main(String[] args) {

        AnimalFactory animalFactory;

        animalFactory = new WildAnimalFactory();
        Dog dog = animalFactory.createDog();
        Tiger tiger = animalFactory.createTiger();

        dog.showName();
        tiger.showBehavior();

        System.out.println("============================");

        animalFactory = new PetAnimalFactory();
        dog = animalFactory.createDog();
        tiger = animalFactory.createTiger();

        dog.showName();
        tiger.showBehavior();
    }
}
