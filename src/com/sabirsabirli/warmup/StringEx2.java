package com.sabirsabirli.warmup;

import java.util.Scanner;

public class StringEx2 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String str = " ";
        System.out.println("Please enter any text: ");
        str = scn.nextLine();

            str = str.replace("x"," ").trim().replace(" ","x");
        System.out.println(str);
    }
}
