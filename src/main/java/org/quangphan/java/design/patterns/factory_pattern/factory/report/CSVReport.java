package org.quangphan.java.design.patterns.factory_pattern.factory.report;

public class CSVReport implements Report {

    @Override
    public void generate() {
        System.out.println("CSV Report generate");
    }
}
