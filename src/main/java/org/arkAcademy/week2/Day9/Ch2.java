package org.arkAcademy.week2.Day9;

import java.util.ArrayList;

public class Ch2 {
    public static void main(String[] args) {
        ArrayList<String> txt = new ArrayList<>();
        txt.add("one");
        txt.add("two");
        txt.add("three");
        txt.add("four");
        txt.add("five");
        txt.add("million");

        String newElement = "eleven";
        txt.add(newElement);

        txt.remove(3);

        String elementToCheck = "Banana";
        boolean elementExists = txt.contains(elementToCheck);
        // Print the result
        if (elementExists) {
            System.out.println(elementToCheck + " exists in the ArrayList.");
        } else {
            System.out.println(elementToCheck + " does not exist in the ArrayList.");
        }

        System.out.println("The Final list : " + txt);

    }
}
