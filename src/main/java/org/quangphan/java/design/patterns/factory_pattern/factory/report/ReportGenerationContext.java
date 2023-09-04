package org.quangphan.java.design.patterns.factory_pattern.factory.report;

public class ReportGenerationContext {

    private Report report;

    public void setReport(Report report) {
        this.report = report;
    }

    public void generateReport() {
        this.report.generate();
    }
}
