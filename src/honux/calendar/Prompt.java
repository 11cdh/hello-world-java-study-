package honux.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> "; // 상수 선

	public void runPrompt() {
		int month;
		String PROMPT = "cal> ";

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("월을 입력하세요.");

		while (true) {
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue; // 실행시 루프의 처음으로 돌아간다.
			}
			cal.PrintCalendar(2017, month);
		}

		System.out.println("bye");

		scanner.close();
	}

	public static void main(String[] args) { // 쉘 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
