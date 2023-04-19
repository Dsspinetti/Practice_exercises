package com.example.chatgpt.practice_exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PracticeExercisesApplication {

    public static void main(String[] args) {
        int userProgramNumber;
        boolean keepPlaying = true;
        Scanner scnr = new Scanner(System.in);

        SpringApplication.run(PracticeExercisesApplication.class, args);


        while (keepPlaying == true){
            System.out.println("Select a program from the following list: ");
            System.out.println("1. Age in ten years");
            System.out.println("2. Palindrome Check");
            System.out.println("3. Fibonacci");
            System.out.println("4. Sum, Avg, Min, Max");
            System.out.println("9. Exit");
            userProgramNumber = scnr.nextInt();
            switch (userProgramNumber) {
                case 1:
                    ageInTenYears();
                    break;
                case 2:
                    palindrome();
                    break;
                case 3:
                    fibonacci();
                    break;
                case 4:
                    sumAvgMinMax();
                    break;
                case 9:
                    keepPlaying = false;
                    break;
            }


        }
        System.out.println("Thank you for playing!");
    }

    private static void sumAvgMinMax() {
        System.out.println("Enter a list of integers and I will return the sum, average, min, and max numbers");
        System.out.println("First, give me the amount of numbers you will input:");
        Scanner scnr = new Scanner(System.in);
        int length = scnr.nextInt();
        int[] numbers = new int[length];
        System.out.println("Now the list separating each number with a space:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scnr.nextInt();
        }

        int sumTotal = 0;
        int min = numbers[0];
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumTotal = numbers[i] + sumTotal;
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Sum: " + sumTotal);
        System.out.println("Average: " + (sumTotal / numbers.length));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    private static void fibonacci() {
        System.out.println("Enter a length for me to generate a fibonacci sequence up to");
        Scanner scnr = new Scanner(System.in);
        int userNum = scnr.nextInt();
        int a = 0, b = 1;
        System.out.print(a + ", " + b);
        int printedNum = 0;
        for (int i = 2; i < userNum; i++) {
            printedNum = a + b;
            System.out.print(", " + printedNum);
            a = b;
            b = printedNum;

        }
        System.out.println();
    }

    private static void palindrome() {
        System.out.println("Input a word with no spaces and I will check if it is a palindrome");
        Scanner scnr = new Scanner(System.in);
        String userInput = scnr.next();
        String reverseWord = "";

        for (int i = (userInput.length() - 1); i >= 0; i--) {

            char c = userInput.charAt(i);
            reverseWord = reverseWord + c;
        }
        if (reverseWord.equals(userInput)) {
            System.out.println(userInput + " is a palindrome! :)");
        } else {
            System.out.println(userInput + " is not a palindrome. :(");
        }
    }

    private static void ageInTenYears() {
        System.out.println("Please input your name and age separated by a space.");
        Scanner scnr = new Scanner(System.in);
        String name = scnr.next();
        int age = scnr.nextInt();
        System.out.println("Hello " + name + " you will be " + (age + 10) + " in 10 years.");
    }


}
