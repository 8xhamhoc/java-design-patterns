package org.quangphan.java.design.patterns.adapter_pattern.moneyexchange;

public class EuroToVNDAdapter implements CurrencyConverter {

    private final EuroCurrencyConverter euroCurrencyConverter;

    public EuroToVNDAdapter(EuroCurrencyConverter euroCurrencyConverter) {
        this.euroCurrencyConverter = euroCurrencyConverter;
    }

    @Override
    public double convert(double amount) {
        return euroCurrencyConverter.euroToVnd(amount);
    }
}
