/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module3labq1;
   import java.util.Scanner;
/**
 *
 * @author ramlifting
 */
public class Module3LabQ1 {

  public static int calculateQuotient(int a, int b) {
    return a / b;
  }

  public static int calculateRemainder(int a, int b) {
    return a % b;
  }

  public static void separateDigits(int number) {
    int divider = 1;
    while (number / divider >= 10) {
      divider *= 10;
    }

    while (divider > 0) {
      int singleDigit = number / divider;
      System.out.print(singleDigit + "  ");
      number = number % divider;
      divider /= 10;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 99999: ");
    int inputNumber = scan.nextInt();

    System.out.println("The individual digits are:");
    separateDigits(inputNumber);
  }
}
