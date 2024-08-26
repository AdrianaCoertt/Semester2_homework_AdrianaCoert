/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructormethodexercise;

/**
 *
 * @author adria
 */
public class Main {
      public static void main(String[] args) {
        // Create a Book object using the constructor
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);

        // Display book details
        myBook.displayDetails();

        // Apply a discount to the book
        myBook.applyDiscount(10);

        // Display book details again to show updated price
        myBook.displayDetails();
    }
}
