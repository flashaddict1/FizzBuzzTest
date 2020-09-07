package fizzBuzzProject;

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Amount");
        //User Enters Amount they want FizzBuzz to go to.
        String fizzBuzzAmount = myObj.nextLine();
        //User Number is converted from a string to an integer.
        fizzBuzz(Integer.parseInt(fizzBuzzAmount));
    }

    public static void fizzBuzz(int fizzBuzzAmount) {
        //Creates a loop to go from 1 to the user entered amount
        for (int i = 1; i <= fizzBuzzAmount; i++) {
            //If the amount is equal to 15 ( both 3 and 5 ) then it is FizzBuzz
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
                //If the amount is equal to 3 then it is Fizz
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                //If the amount is equal to 5 then it is Buzz
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            //Print all numbers not equal to 3 or 5
            System.out.println(i);
        }
    }
}

