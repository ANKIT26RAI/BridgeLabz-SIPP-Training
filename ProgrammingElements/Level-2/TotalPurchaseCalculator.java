package com.studyopedia.level2;
import java.util.*;
public class TotalPurchaseCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the unit price of the item: ");
        float unitPrice = scanner.nextFloat();
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();
        float totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);
        scanner.close();

	}

}
