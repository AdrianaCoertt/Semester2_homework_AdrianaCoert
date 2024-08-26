
import encapsulationexercise.BankAccount;

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
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount("123456789", 1000.0);

        // Demonstrate encapsulation
        System.out.println("Initial Balance: " + myAccount.checkBalance());

        // Deposit funds
        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: " + myAccount.checkBalance());

        // Withdraw funds
        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + myAccount.checkBalance());

        // Attempt to withdraw more than available balance
        myAccount.withdraw(2000.0);
        System.out.println("Final Balance: " + myAccount.checkBalance());
    }
}
