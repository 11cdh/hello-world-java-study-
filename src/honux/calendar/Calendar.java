package honux.calendar;

import java.util.Scanner;

public class Calendar {

	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void PrintSampleCalendar() {
		System.out.println(" 일 월  화 수  목 금 토");
		System.out.println("-------------------- ");
		System.out.println(" 1  2  3  4  5  6  7 ");
		System.out.println(" 8  9 10 11 12 13 14 ");
		System.out.println("15 16 17 18 19 20 21 ");
		System.out.println("22 23 24 25 26 27 28 ");

	}

	public static void main(String[] args) {

		int month;
		String PROMPT = "cal> ";

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("달을 입력하세요.");
		
		while(true) {
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1)
			{
				break;
			}
			if (month > 12)
			{
				continue; // 실행시 루프의 처음으로 돌아간다.
			}
			System.out.printf("%d월은 %d일 까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
		}

		cal.PrintSampleCalendar();

		scanner.close();

	}
}
