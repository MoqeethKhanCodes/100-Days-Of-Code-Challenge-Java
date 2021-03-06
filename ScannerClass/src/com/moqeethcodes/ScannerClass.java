package com.moqeethcodes;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2021 - yearOfBirth;

            if(age >= 0 && age <= 100){

                System.out.println("Your name is " + name + ", and you are " + age + " years old");

            }else{

                System.out.println("Invalid Year Of Birth!");
            }
        }else {
            System.out.println("Unable to parse the year of birth");
        }

        scanner.close();
    }
}
