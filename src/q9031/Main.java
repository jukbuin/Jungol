package q9031;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num1 > num2) {
			System.out.print("입력받은 수 중 큰 수는 " + num1 + "이고 작은 수는 " + num2 + "입니다.");
		} else if (num2 > num1) {
			System.out.print("입력받은 수 중 큰 수는 " + num2 + "이고 작은 수는 " + num1 + "입니다.");
		} else {
			System.out.print("같은 수 입니다.");
		}
	}
}
