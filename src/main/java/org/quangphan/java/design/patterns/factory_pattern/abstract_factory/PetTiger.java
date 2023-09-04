package org.quangphan.java.design.patterns.factory_pattern.abstract_factory;

public class PetTiger implements Tiger {

    @Override
    public void showBehavior() {
        System.out.println("Pet tiger smiles");
    }
}
