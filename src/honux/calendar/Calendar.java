package honux.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		int month;
		int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String s1;
		System.out.println(" 일 월  화 수  목 금 토");
		System.out.println("-------------------- ");
		System.out.println(" 1  2  3  4  5  6  7 ");
		System.out.println(" 8  9 10 11 12 13 14 ");
		System.out.println("15 16 17 18 19 20 21 ");
		System.out.println("22 23 24 25 26 27 28 ");

		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);

		s1 = scanner.next();
		month = Integer.parseInt(s1);

		System.out.printf("%d월은 %d일 까지 있습니다. \n", month, maxDays[month - 1]);
		scanner.close();

	}
}
