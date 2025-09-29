package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String lastName;
        String middleInitial;
        String nameSuffix;

        System.out.print("Please enter your first name: ");
        firstName = keyboard.nextLine();
        firstName = firstName.trim();
        System.out.print("Pleas enter your last name: ");
        lastName = keyboard.nextLine();
        lastName = lastName.trim();

        System.out.printf("\nYour name is: %s %s", firstName, lastName);


    }
}
