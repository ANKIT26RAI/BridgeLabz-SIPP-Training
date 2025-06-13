package com.studyopedia;

public class FixedFeeDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  double fee = 125000;
      double discountPercent = 10;

     double discount = (fee * discountPercent) / 100;
     double finalFee = fee - discount;

     System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	}

}
