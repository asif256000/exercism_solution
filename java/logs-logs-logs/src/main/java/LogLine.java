public class LogLine {
    private String logLine;
    private final String abbvLvl;

    public LogLine(String logLine) {
        this.logLine = logLine;
        this.abbvLvl = logLine.substring(1, 4);
    }

    public LogLevel getLogLevel() {
        return switch (abbvLvl) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        String strLog = this.logLine.substring(7);
        int logSeverity = this.getLogLevel().getSeverity();
        return String.format("%d:%s", logSeverity, strLog);
    }
}
