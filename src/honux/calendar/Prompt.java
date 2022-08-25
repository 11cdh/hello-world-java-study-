package honux.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "> "; // 상수 선

	public void runPrompt() {
		int month, year;

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {

			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();

			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue; // 실행시 루프의 처음으로 돌아간다.
			}
			cal.PrintCalendar(year, month);
		}

		System.out.println("bye");

		scanner.close();
	}

	public static void main(String[] args) { // 쉘 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
