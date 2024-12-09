package org.example;

import java.util.*;

/* The View class give the user the options to interact with the functions of the controller class
through a list of options that are output to the console, it takes the user's input to decide where to go
*/
public class Main {
    public static void main(String[] args) {
        //Initializes scanner
        Scanner myObj = new Scanner(System.in);
        //Initializes variables for loop
        int inf = 0;
        int cho = 0;
        //Initializes library object
        ContrTest C1 = new ContrTest();
        ModelTest M1 = new ModelTest();

        //Infinite loop
        while (inf == 0) {
            //User prompt
            System.out.println("Enter 1 to display people\nEnter 2 to add a person manually\nEnter 3 to enter a person through a file\nEnter 4 to remove a person\nEnter 5 to edit a person\nEnter 6 to get a person's BMI\nEnter 0 to exit");
            //prevents wrong data types from crashing the software
            try {
                //Takes user input
                cho = myObj.nextInt();
                //Fixes problem with nextInt
                String nul = myObj.nextLine();
                if (cho == 1) {
                    C1.printPeople();
                } else if (cho == 2) {
                    //Prompts and takes data for function
                    System.out.println("Enter the person's name");
                    M1.Tnam = myObj.nextLine();
                    System.out.println("Enter the person's blood type (A+ , A- , B+ , B- , AB+ , AB-, O+, O-)");
                    M1.Ttyp = myObj.nextLine();
                    System.out.println("Enter the person's age (whole integers)");
                    M1.Tage = myObj.nextInt();
                    System.out.println("Enter the person's blood pressure (number and decimal '102.2')");
                    M1.Tpre = myObj.nextFloat();
                    System.out.println("Enter the person's height in inches (number and decimal '74.5')");
                    M1.Thei = myObj.nextFloat();
                    System.out.println("Enter the person's weight in pounds (number and decimal '212.3')");
                    M1.Twei = myObj.nextFloat();
                    C1.addManual();
                } else if (cho == 3) {
                    //Prompts and takes file name for function
                    System.out.println("Enter the name of the file you are entering");
                    M1.Tfile = myObj.nextLine();
                    C1.addFile();
                } else if (cho == 4) {
                    //Prompts and takes data for function
                    System.out.println("Enter name of person to remove");
                    M1.Tnam = myObj.nextLine();
                    System.out.println("Enter the person's blood type (A+ , A- , B+ , B- , AB+ , AB-, O+, O-)");
                    M1.Ttyp = myObj.nextLine();
                    C1.removePerson();
                } else if (cho == 5) {
                    //Prompts and takes data for function
                    System.out.println("Enter name of person to edit");
                    M1.TTnam = myObj.nextLine();
                    System.out.println("Enter the person's blood type (A+ , A- , B+ , B- , AB+ , AB-, O+, O-)");
                    M1.TTtyp = myObj.nextLine();
                    System.out.println("Enter the person's name");
                    M1.Tnams = myObj.nextLine();
                    System.out.println("Enter the person's blood type (A+ , A- , B+ , B- , AB+ , AB-, O+, O-)");
                    M1.Ttyps = myObj.nextLine();
                    System.out.println("Enter the person's age (whole integers)");
                    M1.Tages = myObj.nextLine();
                    System.out.println("Enter the person's blood pressure (number and decimal '102.2')");
                    M1.Tpres = myObj.nextLine();
                    System.out.println("Enter the person's height in inches (number and decimal '74.5')");
                    M1.Theis = myObj.nextLine();
                    System.out.println("Enter the person's weight in pounds (number and decimal '212.3')");
                    M1.Tweis = myObj.nextLine();
                    C1.editPerson();
                } else if (cho == 6) {
                    //Prompts and takes data for function
                    System.out.println("Enter name of person to get bmi of");
                    M1.Tnam = M1.myObj.nextLine();
                    System.out.println("Enter blood type of person to get bmi of (A+ , A- , B+ , B- , AB+ , AB-, O+, O-)");
                    M1.Ttyp = M1.myObj.nextLine();
                    C1.getBMI();
                } else if (cho == 0) {
                    //Shuts down program
                    System.exit(0);
                }
            } catch (Exception e) {
                //alerts user
                System.out.println("That is not the correct data type");
                //breaks out of infinite loop
                myObj.next();
            }

        }
    }
}
