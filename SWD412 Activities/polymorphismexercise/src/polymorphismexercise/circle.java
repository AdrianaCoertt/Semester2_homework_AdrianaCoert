/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphismexercise;

/**
 *
 * @author adria
 */
public class circle extends Shape {
    private double radius;

    // Constructor
    public circle(double radius) {
        this.radius = radius;
    }

    // Override the area() method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
  
