package org.quangphan.java.design.patterns.factory_pattern.factory.report;

public class PDFReport implements Report {

    @Override
    public void generate() {
        System.out.println("PDF Report generate");
    }
}
