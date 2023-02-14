/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module3labq2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ramlifting
 */
public class Module3LabQ2 {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random generator = new Random();
    int target = generator.nextInt(1000) + 1;
    int guess;

    do {
      System.out.print("Try to guess the number between 1 and 1000: ");
      guess = input.nextInt();
      if (guess > target) {
        System.out.println("Too high. Please guess again.");
      } else if (guess < target) {
        System.out.println("Too low. Please guess again.");
      }
    } while (guess != target);

    System.out.println("Congratulations! You have successfully guessed the number.");
    System.out.print("Would you like to play again (y/n)? ");
    String playAgain = input.next();

    if (playAgain.equalsIgnoreCase("y")) {
      main(null);
    } else {
      System.out.println("Thank you for playing!");
    }
  }
}

