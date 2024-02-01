package org.arkAcademy.week2.Day8;

import java.util.Scanner;

public class Ch6 {
        public static void main(String[] args) {
            int positive ;
            Scanner inputscanner = new Scanner(System.in);
            do {
                System.out.println("Enter a positive integer :");
            try {
                positive = inputscanner.nextInt();

                if(positive >= 0){

                }
            } catch (NumberFormatException nfe) {
                throw new SomeUserDefinedException("Please enter only numeric values");
            }

        }
}
