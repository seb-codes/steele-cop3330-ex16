package org.example;

import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your age? ");
        Integer age = scan.nextInt();

        final String msg = age >= 16
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";

        System.out.println(msg);
    }
}
