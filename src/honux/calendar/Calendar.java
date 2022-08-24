package honux.calendar;

import java.util.Scanner;

public class Calendar {

	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void PrintCalendar(int year , int month) {
		
		System.out.printf("  << %4d년 %2d월 >> \n", year, month);
		System.out.println(" 일 월  화 수  목 금 토");
		System.out.println("-------------------- ");
		System.out.println(" 1  2  3  4  5  6  7 ");
		System.out.println(" 8  9 10 11 12 13 14 ");
		System.out.println("15 16 17 18 19 20 21 ");
		System.out.println("22 23 24 25 26 27 28 ");

		int maxdays = getMaxDaysOfMonth(month);
		
		if (maxdays == 30) {
			System.out.println("29 30");
		} else if (maxdays == 31) {
			System.out.println("29 30 31");
		}
	}

}
