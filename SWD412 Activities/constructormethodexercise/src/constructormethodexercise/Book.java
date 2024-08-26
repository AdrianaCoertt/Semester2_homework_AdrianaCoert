/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructormethodexercise;

/**
 *
 * @author adria
 */
public class Book {
    // Properties of the Book class
    private String title;
    private String author;
    private double price;

    // Constructor to initialize the properties
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: R" + price);
    }

    // Method to apply a discount to the book price
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            double discountAmount = price * discountPercentage / 100;
            price -= discountAmount;
            System.out.println("Discount of " + discountPercentage + "% applied. New price: R" + price);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }
}
