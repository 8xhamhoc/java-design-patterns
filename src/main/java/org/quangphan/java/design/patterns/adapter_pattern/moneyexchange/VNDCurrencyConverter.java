package org.quangphan.java.design.patterns.adapter_pattern.moneyexchange;

public class VNDCurrencyConverter {

    public double vndToUsd(double amount) {
        return amount * 0.000045;
    }
}
