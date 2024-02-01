package org.arkAcademy.week2.Day7.Ch3;

public abstract class Shape implements Drawable{
    private String color;
    // Constructor
    public Shape(String color) {
        this.color = color;
    }
    // Abstract method for calculating area
    public abstract double calculateArea();
    // Concrete method
    public void displayColor() {
        System.out.println("Color: " + color);
    }
    public void displayShapeType(){
        System.out.println("The shape type is :");
    }
}
