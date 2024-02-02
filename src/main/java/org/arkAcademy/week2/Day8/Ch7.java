package org.arkAcademy.week2.Day8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ch7 {
    public static void main(String[] args) {
        // Replace "example.txt" with the actual file path
        String filePath = "example.txt";

        // Using try-with-resources to automatically close the resources (FileReader and BufferedReader)
        try (
                FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle file I/O exceptions
            System.out.println("IO exception");
        }
    }
}
