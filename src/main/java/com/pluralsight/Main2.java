package com.pluralsight;

import java.util.Scanner;

public class Main2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        String fullName = promptForString("Full name:");

        System.out.println();

        String billingStreet = promptForString("Billing Street: ");
        String billingCity =promptForString("Billing City: ");
        String billingState = promptForString("Billing State: ");
        String billingZip =promptForString("Billing Zip: ");

        System.out.println();

        String shippingStreet =promptForString("Shipping Street: ");
        String shippingCity = promptForString("Shipping City: ");
        String shippingState =promptForString("Shipping State: ");
        String shippingZip =promptForString("Shipping Zip: ");

        System.out.println(fullName);

        System.out.println();
        System.out.println(formatAddress(billingStreet, billingCity, billingState, billingZip));

        System.out.println();
        System.out.println(formatAddress(shippingStreet, shippingCity, shippingState, shippingZip));


    }
    
    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String formatAddress(String street, String city, String state, String zip){
        return String.format("%s\n%s, %s  %s\n", street, city, state, zip);
    }

}
