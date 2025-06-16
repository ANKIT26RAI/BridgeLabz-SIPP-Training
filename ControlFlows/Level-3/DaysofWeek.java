package com.studyopediaControlFlows.level3;
import java.util.*;

public class DaysofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m = Integer.parseInt(args[0]);  // month
        int d = Integer.parseInt(args[1]);  // day
        int y = Integer.parseInt(args[2]);  // year

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Day of the Week: " + days[d0] + " (" + d0 + ")");
    }
	}

