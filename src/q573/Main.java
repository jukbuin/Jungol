package q573;

import java.util.Scanner;

class Sqare {

	public void sqare(int num) {
		if (num < 100 && num > 0) {
			int j = num * num;

			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
				if (i % num == 0) {
					System.out.println();
				}
			}
		} else {
			System.out.println("100 미만의 수를 입력해주세요.");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		Sqare sqare = new Sqare();
		sqare.sqare(num);
	}

}
