package org.quangphan.java.design.patterns.cor_pattern.logs;

public interface LogHandler {

    void setNextHandler(LogHandler logHandler);
    void handleLogMessage(LogMessage logMessage);
}
