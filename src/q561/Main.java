package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int max = 0;
		int min = 10000;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 100) {
				max = max > a[i] ? max : a[i];
			} else if (a[i] >= 100) {
				min = min > a[i] ? a[i] : min;
			}
		}
		if (max == 0) {
			max = 100;
		}
		if (min == 10000) {
			min = 100;
		}
		System.out.print(max + " " + min);
	}
}
