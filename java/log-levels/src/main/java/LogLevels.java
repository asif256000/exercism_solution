public class LogLevels {

    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        String lvl = logLine.split(":")[0].trim().toLowerCase();
        return lvl.substring(1, lvl.length() - 1);
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
