package com.studyopedia.JavaMethods.Level2;

public class TempVolumeConverter {

	
		// TODO Auto-generated method stubpublic class TemperatureVolumeConverter {
	    public static double convertFahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5 / 9;
	    }

	    public static double convertCelsiusToFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	    public static double convertPoundsToKilograms(double pounds) {
	        return pounds * 0.453592;
	    }

	    public static double convertKilogramsToPounds(double kilograms) {
	        return kilograms * 2.20462;
	    }

	    public static double convertGallonsToLiters(double gallons) {
	        return gallons * 3.78541;
	    }

	    public static double convertLitersToGallons(double liters) {
	        return liters * 0.264172;
	    }

	    public static void main(String[] args) {
	        System.out.println("100°F to Celsius: " + convertFahrenheitToCelsius(100));
	        System.out.println("5 gallons to liters: " + convertGallonsToLiters(5));
	    
	

	}

}
