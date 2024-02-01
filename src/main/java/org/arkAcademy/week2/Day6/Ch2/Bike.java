package org.arkAcademy.week2.Day6.Ch2;

public class Bike extends Vehicle {
    private String frame;
    public Bike(String make, String model, int rentalPrice, String frame) {
        super(make, model, rentalPrice);
        this.frame = frame;
    }
    public String getBreaks() {
        return frame;
    }
    public void setBreaks(String breaks) {
        this.frame=frame;
    }
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Frame: " + frame );
    }
}
