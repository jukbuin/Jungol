package q575;

import java.util.Scanner;

public class Main {

	public static void power(int num1, int num2) {
		int p = 1;
		if (num1 <= 10 && num2 <= 10) {
			for (int i = 0; i < num2; i++) {
				p *= num1;
			}
		}
		System.out.print(p);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		power(num1, num2);
	}

}
