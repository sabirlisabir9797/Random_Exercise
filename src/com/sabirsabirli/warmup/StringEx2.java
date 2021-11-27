package com.sabirsabirli.warmup;

import java.util.Scanner;

public class StringEx2 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String str = " ";
        System.out.println("Please enter any text: ");
        str = scn.nextLine();

        str = str.replace("x", " ").trim().replace(" ", "x");
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if (!str.contains("x")) {
                break;
            } else {
                str = str.replace("x", "");
            }
        }

        for (int j = str.length() - 1; j >= 0; j--) {
            if (!str.contains("x")) {
                break;
            } else {
                str = str.replace("x", "");
            }
        }
    }
}
