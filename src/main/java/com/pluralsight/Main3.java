package com.pluralsight;

import java.util.Scanner;

public class Main3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        String fullName = promptForString("Full name:");

        System.out.println();

        Address billingAddress = promptForAddress("Billing");

        System.out.println();

        Address shippingAddress = promptForAddress("Shipping");

        System.out.println(fullName);

        System.out.println();
        System.out.println(formatAddress(billingAddress));

        System.out.println();
        System.out.println(formatAddress(shippingAddress));

    }

    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static Address promptForAddress(String addressLabel){
        String street = promptForString( addressLabel + " Street: ");
        String city =promptForString( addressLabel + " City: ");
        String state = promptForString( addressLabel + " State: ");
        String zip =promptForString( addressLabel + " Zip: ");
        return new Address(street, city, state, zip);
    }

    public static String formatAddress(Address address){
        return String.format("%s\n%s, %s  %s\n", address.getStreet() , address.getCity(), address.getState(), address.getZip());
    }

}
