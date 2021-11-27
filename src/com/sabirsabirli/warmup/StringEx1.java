package com.sabirsabirli.warmup;

import java.util.Scanner;

public class StringEx1 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String str = " ";
        System.out.println("Please enter any text: ");
        str = scn.nextLine();
        System.out.println(str.replace("x", ""));

    }
}
