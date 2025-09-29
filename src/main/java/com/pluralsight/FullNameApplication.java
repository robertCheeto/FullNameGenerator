package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String lastName;
        String middleName;
        String nameSuffix;

        System.out.print("Please enter your first name: ");
        firstName = keyboard.nextLine();
        firstName = firstName.trim();
        System.out.print("Pleas enter your last name: ");
        lastName = keyboard.nextLine();
        lastName = lastName.trim();

        System.out.print("(Optional) Please enter your middle name/initial: ");
        middleName = keyboard.nextLine();
        middleName = middleName.trim();
        System.out.print("(Optional) Please enter your suffix: ");
        nameSuffix = keyboard.nextLine();
        nameSuffix = nameSuffix.trim();

        String fullName = firstName + " " + middleName + " " + lastName + " " + nameSuffix;


        System.out.printf("\nYour name is: " + fullName);


    }
}
