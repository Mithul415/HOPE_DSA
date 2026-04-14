import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class LogWriter {
    private String fileName;

    public LogWriter(String fileName) {
        this.fileName = fileName;
    }

    public void write(LogEntry entry) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(entry.format() + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing log");
        }
    }

    public long getFileSize() {
        File file = new File(fileName);
        return file.length();
    }

    public String getFileName() {
        return fileName;
    }
}