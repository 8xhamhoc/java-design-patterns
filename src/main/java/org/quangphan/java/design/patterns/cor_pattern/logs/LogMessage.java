package org.quangphan.java.design.patterns.cor_pattern.logs;

public class LogMessage {

    private String message;
    private LogSeverity logSeverity;

    public LogMessage(String message, LogSeverity logSeverity) {
        this.message = message;
        this.logSeverity = logSeverity;
    }

    public String getMessage() {
        return message;
    }

    public LogSeverity getLogSeverity() {
        return logSeverity;
    }
}
