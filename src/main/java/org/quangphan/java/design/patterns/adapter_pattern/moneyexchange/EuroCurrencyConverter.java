package org.quangphan.java.design.patterns.adapter_pattern.moneyexchange;

public class EuroCurrencyConverter {

    public double euroToUsd(double amount) {
        return amount * 1.17;
    }

    public double euroToVnd(double amount) {
        return amount * 26400.0;
    }
}
