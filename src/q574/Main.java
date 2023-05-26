package q574;

import java.util.Scanner;

public class Main {

	public static void max(int[] n) {
		if (n[0] > n[1] && n[0] > n[2]) {
			System.out.println(n[0]);
		} else if (n[1] > n[0] && n[1] > n[2]) {
			System.out.println(n[1]);
		} else {
			System.out.println(n[2]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		max(num);
	}

}
