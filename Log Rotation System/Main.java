public class Main {
    public static void main(String[] args) {
        LogWriter writer = new LogWriter("log.txt");
        LogRotator rotator = new LogRotator(3, 100);
        String[] messages = {
            "User logged in",
            "File uploaded",
            "Error occurred",
            "System rebooted",
            "New connection established",
            "Warning: High memory usage"
        };
        for (String msg : messages) {
            LogEntry entry = new LogEntry(msg, "INFO");
            writer.write(entry);
            String newFile = rotator.rotate(writer.getFileName());
            writer = new LogWriter(newFile);
        }
        System.out.println("Logs written successfully!");
    }
}