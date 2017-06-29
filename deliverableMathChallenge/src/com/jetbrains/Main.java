package com.jetbrains;
import java.util.Scanner;
import java.lang.Integer;
public class Main {

    public static void main(String[] args) {

        String userInput = "";
        int i = 0;
        double summation = 0;

        System.out.println("This program checks a positive integer");
        System.out.println("and outputs true if the sum of the cubes of");
        System.out.println("the integer's digits is equal to the integer itself.");

        System.out.print("Please enter a positive integer: ");

        Scanner scnr = new Scanner(System.in);
        userInput = scnr.next();

        i = 0;
        for(i = 0; i < userInput.length(); ++i) {
            if ((Character.isDigit(userInput.charAt(i))) == true) {
                int digit = Integer.valueOf(userInput.charAt(i)) - 48;
                /* I am using the Integer.valueOf function to convert userInput from a string to an integer
                   which can be used in the Math.pow function. Because Integer.valueOf captures (and outputs)
                   the ASCII code for each digit I need to subtract 48 each time. I use 48 because 48 is the ASCII
                   code for 0. For each, if userInput.charAt(1) equals 2 the Integer.valueOf function will read the 2
                   as 50 (since 50 is the ASCII code for 2), thus subtracting 48 will yield the correct integer of 2.*/

                summation = summation + Math.pow((double) digit, 3.0);
            }
            else{
                System.out.print("Error: This Program only accepts positive integer values.");
                System.exit(0);
            }
        }
        int finalNum = (int) summation;

        if (finalNum == Integer.parseInt(userInput)) {
            // I use Integer.parseInt here because I can not compare an integer to a string.
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        return;

            }
        }



