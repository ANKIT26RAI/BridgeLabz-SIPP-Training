package com.studyopedia.JavaMethods.Level1;
import java.util.Scanner;
public class Trigonometric {
	public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("\nEnter angle in degrees: ");
	        double angle = sc.nextDouble();
	        double[] trig = calculateTrigonometricFunctions(angle);
	        System.out.println("Sine: " + trig[0] + ", Cosine: " + trig[1] + ", Tangent: " + trig[2]);

	        sc.close();

	}

}
