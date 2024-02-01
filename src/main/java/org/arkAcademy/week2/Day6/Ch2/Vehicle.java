package org.arkAcademy.week2.Day6.Ch2;

public class Vehicle {
    private String make;
    private String model;
    private int rentalPrice;
    private boolean rent;

    public Vehicle(String make, String model, int rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.rent=false;
    }
    public boolean isRented(){
        return rent;
    }
    public void setRent(boolean rent) {
        this.rent=rent;
    }
    public String getMake() {

        return make;
    }
    public void setMake(String make) {

        this.make = make;
    }
    public String getModel() {

        return model;
    }
    public void setModel(String model) {

        this.model = model;
    }
    public int getRentalPrice() {

        return rentalPrice;
    }
    public void setRentalPrice(int rentalPrice) {

        this.rentalPrice = rentalPrice;
    }
    public void displayVehicleInfo() {
        System.out.println("Model: " + model + " Make : " + make + "Rental Price : " + rentalPrice);
    }
}
