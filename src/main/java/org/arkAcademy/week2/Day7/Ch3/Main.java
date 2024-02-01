package org.arkAcademy.week2.Day7.Ch3;

public class Main {
    public static void main(String[] args) {

            // Creating objects of concrete subclasses
            Square square = new Square("Red", 5.0);
            Triangle triangle = new Triangle("Blue", 4.0, 6.0);

            // Using methods from the abstract class and interface

        square.displayColor();
            System.out.println("Square Area: " + square.calculateArea());
            square.drawShape();

            triangle.displayColor();
            System.out.println("Triangle Area: " + triangle.calculateArea());
            triangle.drawShape();
        }
    }

