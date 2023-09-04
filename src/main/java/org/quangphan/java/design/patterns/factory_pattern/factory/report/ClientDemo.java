package org.quangphan.java.design.patterns.factory_pattern.factory.report;

public class ClientDemo {

    private static final String PDF_REPORT = "pdf";
    private static final String CSV_REPORT = "csv";

    public static void main(String[] args) {

        Report csvReport = ReportFactory.getInstance(CSV_REPORT);
        Report pdfReport = ReportFactory.getInstance(PDF_REPORT);

        ReportGenerationContext reportGenerationContext = new ReportGenerationContext();
        reportGenerationContext.setReport(csvReport);
        reportGenerationContext.generateReport();

        reportGenerationContext.setReport(pdfReport);
        reportGenerationContext.generateReport();
    }
}
