package org.quangphan.java.design.patterns.cor_pattern.logs;

public class ClientDemo {

    public static void main(String[] args) {

        LogHandler consoleLogHandler = new ConsoleLog();
        LogHandler fileLogHandler = new FileLog();

        // Set up the chain of responsibility
        consoleLogHandler.setNextHandler(fileLogHandler);

        // Send log messages
        LogMessage message1 = new LogMessage("This is an info message", LogSeverity.INFO);
        LogMessage message2 = new LogMessage("This is a warning message", LogSeverity.WARNING);
        LogMessage message3 = new LogMessage("This is an error message", LogSeverity.ERROR);

        consoleLogHandler.handleLogMessage(message1);
        consoleLogHandler.handleLogMessage(message2);
        consoleLogHandler.handleLogMessage(message3);

    }
}
