package org.arkAcademy.week2.Day7.Ch3;

public class Triangle extends Shape{
        public double height;
        public double base;
    public Triangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }
    // Implementing the abstract method
        @Override
        public double calculateArea() {
            return height * base * 0.5;
        }
        // Implementing the draw method from the interface
    @Override
    public void drawShape() {
        System.out.println("Draw a Triangle");
    }

}
