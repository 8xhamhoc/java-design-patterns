package org.quangphan.java.design.patterns.adapter_pattern.moneyexchange;

public class EuroToUSDAdapter implements CurrencyConverter {

    private final EuroCurrencyConverter euroCurrencyConverter;

    public EuroToUSDAdapter(EuroCurrencyConverter euroCurrencyConverter) {
        this.euroCurrencyConverter = euroCurrencyConverter;
    }

    @Override
    public double convert(double amount) {
        return euroCurrencyConverter.euroToUsd(amount);
    }
}
