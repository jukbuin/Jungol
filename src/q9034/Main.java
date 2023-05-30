package q9034;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num1 >= 4 && num2 >= 4) {
			System.out.print("이겼습니다.");
		} else if (num1 >= 4 || num2 >= 4) {
			System.out.print("비겼습니다.");
		} else {
			System.out.print("졌습니다.");
		}
	}

}
