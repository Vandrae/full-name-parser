package com.pluralsight;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for name in one of two formats
        System.out.println("Enter your name in one of the following formats");
        System.out.println("first last or first middle last: ");
        String name = input.nextLine();

        //trim the name
        name = name.trim();
        System.out.println("Please enter your name: " + name);
        System.out.println(" ");

        String[] parts = name.split(" ");

        if (parts.length != 3){
            System.out.print("First Name: " + parts[0] + "\n" + "Middle Name: (none) \n" + "Last Name: " + parts[1] + "\n");
        } else {
            System.out.print("First Name: " + parts[0] + "\n" + "Middle Name: " + parts[1] + "\n" + "Last Name: " + parts[2] + "\n");
        }



        //Parse the name display the individual pieces of the name.


    }
}
