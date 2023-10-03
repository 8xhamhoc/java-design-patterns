package org.quangphan.java.design.patterns.cor_pattern.logs;

public class ConsoleLog implements LogHandler {

    private LogHandler nextLogHandler;

    @Override
    public void setNextHandler(LogHandler logHandler) {
        this.nextLogHandler = logHandler;
    }

    @Override
    public void handleLogMessage(LogMessage logMessage) {
        if (logMessage.getLogSeverity() == LogSeverity.INFO) {
            System.out.println("Console: " + logMessage.getMessage());
        } else if (nextLogHandler != null) {
            nextLogHandler.handleLogMessage(logMessage);
        }
    }
}
