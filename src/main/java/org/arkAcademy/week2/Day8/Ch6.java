package org.arkAcademy.week2.Day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch6 {
        public static void main(String[] args) {
            int positive = 0 ;
            Scanner inputscanner = new Scanner(System.in);
            do {
                System.out.println("Enter a positive integer :");
                try {
                    positive = inputscanner.nextInt();
                    if (positive >= 0) {
                        System.out.println("Positive Integer");
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Must enter a positive Integer");
                    inputscanner.next();
                }
            }while (positive <= 0);
            System.out.println("You entered : " +positive);
            }
}
