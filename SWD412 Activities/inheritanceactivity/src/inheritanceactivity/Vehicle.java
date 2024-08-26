/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceactivity;

/**
 *
 * @author adria
 */
public class Vehicle {
    protected String make;
    protected String model;

    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}
