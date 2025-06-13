package com.studyopedia;
import java.util.*;

public class PurchasePriceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();

	}

}
