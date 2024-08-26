/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class Main {
     public static void main(String[] args) {
        // Create an array of Shape references
        Shape[] shapes = new Shape[2];

        // Instantiate Rectangle and Circle objects
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(7);

        // Demonstrate polymorphism by calling area() on each Shape
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}
}
