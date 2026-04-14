import java.io.File;
public class LogRotator {
    private int maxFiles;
    private long maxSize;

    public LogRotator(int maxFiles, long maxSize) {
        this.maxFiles = maxFiles;
        this.maxSize = maxSize;
    }

    public String rotate(String currentFile) {
        File file = new File(currentFile);
        if (file.length() < maxSize) {
            return currentFile;
        }
        for (int i = maxFiles - 1; i >= 1; i--) {
            File oldFile = new File("log" + i + ".txt");
            File newFile = new File("log" + (i + 1) + ".txt");
            if (oldFile.exists()) {
                oldFile.renameTo(newFile);
            }
        }
        file.renameTo(new File("log1.txt"));
        return "log.txt";
    }
}