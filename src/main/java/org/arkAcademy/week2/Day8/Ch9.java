package org.arkAcademy.week2.Day8;

public class Ch9 {
    public static void main(String[] args) {
            try {
                // Intentionally causing a NullPointerException
                String str = null;
                int length = str.length();  // This line will throw NullPointerException
                System.out.println("Length of the string: " + length);  // This line won't be reached
            } catch (NullPointerException e) {
                // Handling NullPointerException
                System.err.println("Error: NullPointerException occurred.");
                System.err.println("Details: " + e.getMessage());
            }
        }
    }
