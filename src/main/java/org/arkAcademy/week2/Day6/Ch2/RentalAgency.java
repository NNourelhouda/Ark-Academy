package org.arkAcademy.week2.Day6.Ch2;

import java.util.ArrayList;
public class RentalAgency {
    private ArrayList<Vehicle> Avehicle;
    public RentalAgency() {this.Avehicle = new ArrayList<>();}
    public void addVehicle(Vehicle ddvehicle) {Avehicle.add(ddvehicle);}

    public void rentedVehicle(Vehicle entredv ){
        if(!entredv.isRented()) {
            //vehicle not rented .. we can rent.. set changes it to false
            entredv.setRent(true);
            System.out.println("The vehicle successfully is : " + entredv.getMake() + " " + entredv.getModel() + " " + entredv.getRentalPrice());
        }
        System.out.println("The vehicle is already rented. ");
    }
    public void displayAllVehicles() {
        for (Vehicle vehicleFor : Avehicle) {
            if(!vehicleFor.isRented()){
                vehicleFor.displayVehicleInfo();
            }
        }
    }
}

