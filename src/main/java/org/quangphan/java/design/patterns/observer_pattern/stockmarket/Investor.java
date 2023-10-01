package org.quangphan.java.design.patterns.observer_pattern.stockmarket;

public class Investor implements Observer {

    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock) {
        System.out.println(name + " received an update: Latest stock is " + stock);
    }
}
