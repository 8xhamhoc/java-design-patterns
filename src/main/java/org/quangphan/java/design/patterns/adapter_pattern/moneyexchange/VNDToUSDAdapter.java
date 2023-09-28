package org.quangphan.java.design.patterns.adapter_pattern.moneyexchange;

public class VNDToUSDAdapter implements CurrencyConverter {

    private final VNDCurrencyConverter vndCurrencyConverter;

    public VNDToUSDAdapter(VNDCurrencyConverter vndCurrencyConverter) {
        this.vndCurrencyConverter = vndCurrencyConverter;
    }

    @Override
    public double convert(double amount) {
        return vndCurrencyConverter.vndToUsd(amount);
    }
}
