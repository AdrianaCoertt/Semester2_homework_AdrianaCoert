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
    //---------here is the fixed numbers---------\
    double num1=100;
    double num2=5;

    //---------4 mathematical equations operations---------\
    double add = num1 + num2;
    double sub = num1 - num2;
    double mul = num1 * num2;
    double dev = num1 / num2;

    //---------Here is the printed results---------\
    System.out.println("The sum of two numbers is: " + add);
    System.out.println("The sub of two numbers is: " + sub);
    System.out.println("The mul of two numbers is: " + mul);
    System.out.println("The dev of two numbers is: " + dev);

    //-------average print--------\
    double avg = (add + sub + mul + dev)/4;

    //--------print the average--------\
    System.out.println("Avg: " +avg);

    if(avg <10){
      System.out.println("The average is less than 10");
    }
    else if(avg >10){
      System.out.println("The average is greater than 10");
    }
    else{
      System.out.println("The average is exactly 10.");
    }

  }
}