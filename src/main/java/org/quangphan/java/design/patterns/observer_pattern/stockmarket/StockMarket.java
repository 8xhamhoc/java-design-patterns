package org.quangphan.java.design.patterns.observer_pattern.stockmarket;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String latestStock;

    public void setLatestStock(String stock) {
        latestStock = stock;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(latestStock));
    }
}
