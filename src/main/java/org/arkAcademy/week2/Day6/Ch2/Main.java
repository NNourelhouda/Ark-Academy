package org.arkAcademy.week2.Day6.Ch2;

public class Main {
    public static void main(String[] args) {

        Vehicle bikevehicule = new Bike("Trek", "Mountain Bike", 20, "Aluminum");
        Vehicle carvehicule = new Car("Toyota", "Camry", 100, "1.5L Turbocharged");

        RentalAgency rentalAgency = new RentalAgency();
        rentalAgency.addVehicle(bikevehicule);
        rentalAgency.addVehicle(carvehicule);

        rentalAgency.displayAllVehicles();


    }
}
