package org.quangphan.java.design.patterns.adapter_pattern.moneyexchange;

public class USDToVNDAdapter implements CurrencyConverter {

    private final USDCurrencyConverter usdCurrencyConverter;

    public USDToVNDAdapter(USDCurrencyConverter usdCurrencyConverter) {
        this.usdCurrencyConverter = usdCurrencyConverter;
    }

    @Override
    public double convert(double amount) {
        return usdCurrencyConverter.usdToVnd(amount);
    }
}
