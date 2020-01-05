package com.epam.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("***** TASK #1 *****");
        System.out.print("Enter a three digit integer number -> ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numberViceVersa, a, b, c;
        a = number / 100;           // Сотни
        b = (number % 100) / 10;    // Десятки
        c = (number % 100) % 10;    // Единицы
        numberViceVersa = c * 100 + b * 10 + a;
        System.out.println("number vice versa = " + numberViceVersa);
        System.out.println(number + " - " + numberViceVersa + " = " + (number - numberViceVersa));

        // Task 2
        System.out.println();
        System.out.println("***** TASK #2 *****");
        System.out.print("Enter weight in pounds -> ");
        double weightPounds = input.nextDouble();
        double weightGrams = weightPounds * 453.6F;
        System.out.println("Weight in g = " + weightGrams);
        int kilograms, grams;
        kilograms = (int) weightGrams / 1000;
        grams = (int) weightGrams % 1000;
        grams = grams + (int) ((weightGrams % 1) / 0.5); // Округление
        kilograms = kilograms + grams / 1000;            // Если после округления граммов получится 1000 г
        grams = grams - (grams / 1000) * 1000;
        System.out.println("Weight is " + kilograms + " kg " + grams + " g");

        // Task 3
        System.out.println();
        System.out.println("***** TASK #3 *****");
        System.out.print("Enter deposit amount -> ");
        double amount = input.nextDouble();
        System.out.print("Enter the deposit term in months -> ");
        int period = input.nextInt();
        System.out.print("Enter the annual interest rate -> ");
        double rate = input.nextDouble();
        double interest = amount * rate / 100 / 12 * period;
        System.out.println(amount + " * " + rate + " / 100 / 12 * " + period + " = " + interest);
        double kop = (interest % 1) * 100;           //Копейки
        kop = (int) kop + (int) ((kop % 1) / 0.5);   //Копейки с округлением
        interest = (int) interest + kop / 100;
        System.out.println("The simple interest on " + amount + " for " + period + " months at the rate of " + rate + "% per annum is " + interest);

    }
}
