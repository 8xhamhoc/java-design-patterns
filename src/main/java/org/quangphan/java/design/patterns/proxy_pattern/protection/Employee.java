package org.quangphan.java.design.patterns.proxy_pattern.protection;

public class Employee implements Staff {

    private ReportGeneratorProxy reportGeneratorProxy;
    @Override
    public boolean isOwner() {
        return false;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGeneratorProxy = reportGenerator;
    }

    public String generateDailyReport() {
        try {
            this.reportGeneratorProxy.generateDailyReport();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return "";
    }
}
