package com.studyopedia.JavaMethods.Level1;
import java.util.*;
public class SpringSeason {
	
	public static boolean isSpringSeason(int day, int month) {
		return(day>=20&&month==3)||(month ==4)||(month==5)||(day<=20&&month==6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the day : ");
		int day = sc.nextInt();
		System.out.print("Enter the Month : ");
		int month = sc.nextInt();
		System.out.println(isSpringSeason(day,month)?"It is Spring Season":"It's not a Spring Season");
		

	}

}
