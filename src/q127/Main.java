package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;

		while (true) {
			int num = sc.nextInt();
			if (num < 0 || num > 100) {
				break;
			}
			sum += num;
			cnt++;
		}
		sc.close();

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / cnt);
	}

}
