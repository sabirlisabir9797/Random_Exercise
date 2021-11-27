package com.sabirsabirli;

import java.util.Scanner;

public class RandomEx {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String name = " ";
        int number = 0;
        System.out.println("Please enter your name: ");
        name = scn.nextLine();
        System.out.println("Let's us begin the and go on " + name);
        int rnd = (int) (Math.random() * 100);
        System.out.println("Random number which is generated = " + rnd);

        while (true) {
            System.out.println("Please enter the number");
            number = scn.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("The number must be in the range [0-100]");
            } else {
                if (number == rnd) {
                    System.out.println("Congratulations," + name);
                    break;
                } else if (number > rnd) {
                    System.out.println("Your number is too big. Please, try again.");
                } else {
                    System.out.println("Your number is too small. Please, try again.");
                }
            }

        }


    }
}
