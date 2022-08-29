package honux.calendar;

import java.util.Scanner;

public class Calendar {

	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int year, int month) {
		
		if (isLeapYear(year))
		{
			return LEAP_MAX_DAYS[month - 1];
		}
		else
		{
			return MAX_DAYS[month - 1];
		}
	}

	public boolean isLeapYear(int year) // 윤년일 경우 true값을 리턴한다.
	{
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	public int getWeekDays(String days)
	{
		if (days.equals("SU"))
		{
			return 0;
		}
		else if (days.equals("MO"))
		{
			return 1;
		}
		else if (days.equals("TU"))
		{
			return 2;
		}
		else if (days.equals("WE"))
		{
			return 3;
		}
		else if (days.equals("TU"))
		{
			return 4;
		}
		else if (days.equals("FR"))
		{
			return 5;
		}
		else if (days.equals("SA"))
		{
			return 6;
		}
		else
			return 0;
	
	}
	
	public void PrintCalendar(int year , int month, String weekdays) 
	{
		int start;
		int maxdays = getMaxDaysOfMonth(year, month);
		System.out.printf("  << %4d년 %2d월 >> \n", year, month);
		System.out.println(" SU MO TU WE TU FR SA");
		System.out.println(" -------------------- ");
		
		int days = 1;
		start = getWeekDays(weekdays);
		maxdays = maxdays + start;
		
		for(int i = 1; i <= maxdays; i++)
		{
			if(start != 0)
			{
				System.out.printf("   ");
				start = start - 1;
			}
			else
			{
				System.out.printf("%3d", days);
				days = days + 1;
			}
			
			if (i % 7 == 0)
			{
				System.out.printf("\n");
			}
		}
		System.out.printf("\n");		
	}

}
