package org.quangphan.java.design.patterns.factory_pattern.factory.report;

public class ReportFactory {

    public static Report getInstance(String type) {
        if ("pdf".equals(type)) {
            return new PDFReport();
        } else if ("csv".equals(type)) {
            return new CSVReport();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
