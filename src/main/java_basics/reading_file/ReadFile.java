package java_basics.reading_file;

import java.io.*;
import java.util.Scanner;

class ReadFile {

    void readingFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int lineCount = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Line " + lineCount + ": " + line);
                lineCount += 1;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Looks like file is not found :(");
        }
    }


    void bufferedFileReading(File file){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } catch (IOException e) {
            System.out.println("Problem reading file: " + file.getName());
        } finally {   //////finally is running also if try catch block without exception
            try {
                /// avoiding null pointer exxeption
                if (fileReader != null) fileReader.close();
                if (bufferedReader != null) bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Unable to close Buffered Reader");
            }
        }
    }

    void bufferedFileReadingUpdated(File file){

        //// resources will be closed automatically
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } catch (IOException e) {
            System.out.println("Problem reading file: " + file.getName());
        }
    }

}
