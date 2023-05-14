package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int min1 = 0;
		int min2 = 10000;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 100) {
				min1 = min1 > a[i] ? min1 : a[i];
			} else if (a[i] >= 100) {
				min2 = min2 > a[i] ? a[i] : min2;
			}
		}
		if (min1 == 0) {
			min1 = 100;
		}
		if (min2 == 10000) {
			min2 = 100;
		}
		System.out.print(min1 + " " + min2);
	}
}
