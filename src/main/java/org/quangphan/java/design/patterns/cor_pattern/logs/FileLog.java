package org.quangphan.java.design.patterns.cor_pattern.logs;

public class FileLog implements LogHandler {

    private LogHandler nextLogHandler;

    @Override
    public void setNextHandler(LogHandler logHandler) {
        nextLogHandler = logHandler;
    }

    @Override
    public void handleLogMessage(LogMessage logMessage) {
        if (logMessage.getLogSeverity() == LogSeverity.ERROR ||
                logMessage.getLogSeverity() == LogSeverity.WARNING) {
            System.out.println("File: " + logMessage.getMessage());
        } else if (nextLogHandler != null) {
            nextLogHandler.handleLogMessage(logMessage);
        }
    }
}
