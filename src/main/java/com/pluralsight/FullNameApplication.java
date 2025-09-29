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

        if (middleName.isEmpty() && lastName.isEmpty()) {
            System.out.printf("\nYour full name is:%s %s", firstName, lastName);
        } // if middleName and suffix are empty

        else if (nameSuffix.isEmpty()) {
            System.out.printf("Your full name is:%s %s %s", firstName, middleName, lastName);
        } // if suffix is empty

        else if (middleName.isEmpty()) {
            System.out.printf("Your full name is:%s %s, %s", firstName, lastName, nameSuffix);
        } // if middleName is empty

        else if (firstName.isEmpty() || lastName.isEmpty()){
            System.out.println("You did not enter your first and/or last name!");
        } // if no input is given for the first OR last names

        else {
            System.out.printf("Your full name is:%s %s %s, %s", firstName, middleName, lastName, nameSuffix);
        } // full output when every variable is given an input

    }
}
