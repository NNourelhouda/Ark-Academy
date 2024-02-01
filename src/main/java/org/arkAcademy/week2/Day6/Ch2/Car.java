package org.arkAcademy.week2.Day6.Ch2;

public class Car extends Vehicle {
    private String engine;
    public Car(String make, String model, int rentalPrice, String engine) {
        super(make, model, rentalPrice);
        this.engine = engine;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Engine: " + engine );
    }
}
