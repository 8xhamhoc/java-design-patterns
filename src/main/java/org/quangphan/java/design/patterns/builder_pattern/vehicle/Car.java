package org.quangphan.java.design.patterns.builder_pattern.vehicle;

public class Car extends Vehicle {

    public String brandName;

    public Car(String brandName) {
        this.brandName = brandName;
        System.out.println("We are about to make a : " + this.brandName + " car.");
    }
}
