package q9019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하시오. ");
		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		System.out.print(a[0] + 3 + " ");
		System.out.print(a[1] - 3 + " ");
		System.out.print(a[2] * 3 + " ");
		System.out.print(a[3] / 3 + " ");
		System.out.print(a[4] % 3);
	}

}
