public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("", 0);

    private final String shortName;
    private final int severity;

    LogLevel(String shortName, int severity) {
        this.shortName = shortName;
        this.severity = severity;

    }

    public String getLogLevel() {
        return shortName;
    }

    public int getSeverity() {
        return severity;
    }
}
