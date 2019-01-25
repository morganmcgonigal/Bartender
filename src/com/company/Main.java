package com.company;

public class Main {

    public static void main(String[] args) {

        char water = 1;
        char cola = 2;
        char glenRioAle = 3;

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter your selection and press enter.");
        int drink = userInput.nextInt();

        if (drink == water)
        {
            System.out.println("Here is your water.");
        }
        else if (drink == cola)
        {
            System.out.println("Here is your cola.");
        }
        else if (drink == glenRioAle)
        {
            System.out.println("Please enter your age.");
        }

        java.util.Scanner userInput2 = new java.util.Scanner(System.in);

        int years = userInput2.nextInt();

        int limit = 21 - years;

        if (years >= 21)
        {
            System.out.println("Here is your Ale.");
        }
        else if (years < 21)
        {
            System.out.println("No drink for you! Come back in " + (21 - years) + " years!");
        }


    }
}
