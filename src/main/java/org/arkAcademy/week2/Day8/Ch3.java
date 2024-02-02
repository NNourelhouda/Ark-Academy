package org.arkAcademy.week2.Day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//write in a file
public class Ch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.println("Enter the name of the file you wanna read from :");
        String fileName = scan.nextLine();
        try {
            //open file
           FileInputStream fis = new FileInputStream(fileName);
            Scanner fScanner = new Scanner(fis);
            //read file
            while(fScanner.hasNextLine());
            System.out.println(fScanner.hasNextLine());
        }
        catch (FileNotFoundException fnfe){
            System.out.println("File does not exist");

        }

    }
}
