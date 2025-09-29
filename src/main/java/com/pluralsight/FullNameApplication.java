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
        // need an if statement for if nameSuffix has content, ", " is added to the beginning of the variable
        nameSuffix = nameSuffix.trim();

        if (middleName.isEmpty() && lastName.isEmpty()) {
            System.out.printf("\nYour full name is: %s %s", firstName, lastName);
        } // if middleName and suffix are empty

        else if (nameSuffix.isEmpty()) {
            System.out.printf("Your full name is: %s %s %s", firstName, middleName, lastName);
        } // if suffix is empty

        else if (middleName.isEmpty()) {
            System.out.printf("Your full name is: %s %s, %s", firstName, lastName, nameSuffix);
        } // if middleName is empty
        else {
            System.out.println("You did not enter your first and/or last name!");
        }

    }
}
