package java_basics.reading_file;

import java.io.File;

class ReadFileApp {

    public static void main(String[] args) {
        File file = new File("src/main/java_basics/reading_file/FileToRead.txt");

        ReadFile read = new ReadFile();
        read.readingFile(file);

        System.out.println("\nreading file with buffered method");
        read.bufferedFileReading(file);

        System.out.println("\nreading file with buffered method updated");
        read.bufferedFileReadingUpdated(file);
    }
}
