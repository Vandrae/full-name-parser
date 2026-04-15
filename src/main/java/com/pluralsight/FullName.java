package com.pluralsight;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for name in one of two formats
        System.out.println("Enter your name in one of the following formats");
        System.out.println("first last or first middle last: ");
        String name = input.nextLine();

        //remove possible spaces on the end of the string
        name = name.trim();
        System.out.println("Please enter your name: " + name);
        System.out.println(" ");

        //array that splits name by spaces
        String[] parts = name.split(" ");

        //prints out different parts of the name depending if there are 2 or 3 parts of name var
        if (parts.length != 3){
            System.out.print("First Name: " + parts[0] + "\n" + "Middle Name: (none) \n" + "Last Name: " + parts[1] + "\n");
        } else {
            System.out.print("First Name: " + parts[0] + "\n" + "Middle Name: " + parts[1] + "\n" + "Last Name: " + parts[2] + "\n");
        }

    }
}
