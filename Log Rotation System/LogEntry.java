public class LogEntry {
    private String message;
    private String level;

    public LogEntry(String message, String level) {
        this.message = message;
        this.level = level;
    }

    public String format() {
        return "[" + level + "] " + message;
    }
}