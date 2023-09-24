package org.quangphan.java.design.patterns.proxy_pattern.protection;

public interface Staff {

    boolean isOwner();
    void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
