package org.quangphan.java.design.patterns.observer_pattern.stockmarket;

public class ClientDemo {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Investor investor1 = new Investor("Investor 1");
        Investor investor2 = new Investor("Investor 2");

        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);

        stockMarket.setLatestStock("AAPL: $150.00");
        stockMarket.setLatestStock("GOOGL: $2,800.00");

        stockMarket.removeObserver(investor1);

        stockMarket.setLatestStock("TSLA: $750.00");
    }
}
