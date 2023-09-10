package org.quangphan.java.design.patterns.builder_pattern.vehicle;

public class ClientDemo {

    public static void main(String[] args) {


        Builder builder = new CarBuilder();
        Director director = new CarDirector();

        Vehicle vehicle = director.instruct(builder);
        vehicle.showProduct();

        builder = new MotorCycleBuilder();
        director = new MotorCycleDirector();
        vehicle = director.instruct(builder);
        vehicle.showProduct();

    }
}
