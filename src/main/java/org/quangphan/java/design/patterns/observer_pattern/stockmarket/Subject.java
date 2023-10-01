package org.quangphan.java.design.patterns.observer_pattern.stockmarket;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
