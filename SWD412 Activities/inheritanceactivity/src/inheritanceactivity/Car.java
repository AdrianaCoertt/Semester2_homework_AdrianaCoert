/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceactivity;

/**
 *
 * @author adria
 */
public class Car extends Vehicle {
    private final int numberOfDoors;

    // Constructor
    public Car(String make, String model, int numberOfDoors) {
        super(make, model);  // Call the constructor of the superclass Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    // Override the displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the superclass method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
