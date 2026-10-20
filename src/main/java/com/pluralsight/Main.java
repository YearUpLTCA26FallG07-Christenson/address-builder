package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Full name:");
        String fullName = scanner.nextLine();

        System.out.println();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        System.out.println();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        System.out.println(fullName);
        System.out.println();
        System.out.println(billingStreet);
        System.out.println(billingCity + ", " + billingState + "  " + billingZip);
        System.out.println();
        System.out.println(shippingStreet);
        System.out.println(shippingCity + ", " + shippingState + "  " + shippingZip);


    }
}
