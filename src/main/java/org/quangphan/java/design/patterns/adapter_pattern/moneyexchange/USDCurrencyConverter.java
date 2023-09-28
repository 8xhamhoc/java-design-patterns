package org.quangphan.java.design.patterns.adapter_pattern.moneyexchange;

public class USDCurrencyConverter {

    public double usdToVnd(double amount) {
        return amount * 24000.0;
    }
}
