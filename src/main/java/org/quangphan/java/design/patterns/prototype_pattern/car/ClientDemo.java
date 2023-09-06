package org.quangphan.java.design.patterns.prototype_pattern.car;

public class ClientDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        BasicCar nano = new Nano("Nano1");
        System.out.println("Nano1: " + nano);

        BasicCar clonedCar;

        clonedCar = nano.clone();

        System.out.println("Cloned car: " + clonedCar);

        BasicCar ford = new Ford("Ford1");

        System.out.println("Ford1: " + ford);

        clonedCar = ford.clone();

        System.out.println("Cloned car: " + clonedCar);

    }

}
