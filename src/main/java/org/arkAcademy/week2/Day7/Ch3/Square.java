package org.arkAcademy.week2.Day7.Ch3;

public class Square extends Shape{
        public double side;
        public Square(String color, double side) {
            super(color);
            this.side = side;
        }
        // Implementing the abstract method
        @Override
        public double calculateArea() {
            return side * side;
        }
        // Implementing the draw method from the interface
        @Override
        public void drawShape() {
            System.out.println("Draw a Square");
        }

    }

