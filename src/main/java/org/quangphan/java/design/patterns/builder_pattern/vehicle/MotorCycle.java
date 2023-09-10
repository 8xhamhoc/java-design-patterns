package org.quangphan.java.design.patterns.builder_pattern.vehicle;

public class MotorCycle extends Vehicle {

    public String brandName;

    public MotorCycle(String brandName) {
        this.brandName = brandName;
        System.out.println("We are about to make a : " + this.brandName + " motorcycle.");
    }
}
