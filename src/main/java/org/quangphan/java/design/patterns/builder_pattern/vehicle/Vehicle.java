package org.quangphan.java.design.patterns.builder_pattern.vehicle;

import java.util.LinkedList;

public abstract class Vehicle {

    private LinkedList<String> parts;

    public Vehicle() {
        this.parts = new LinkedList<>();
    }

    public void add(String part) {
        this.parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("These are the construction sequences:");
        parts.forEach(System.out::println);
    }
}
