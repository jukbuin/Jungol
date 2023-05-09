package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 0) {
				for (int b = 0; b < i; i--) {
					System.out.print(a[i - 1] + " ");
				}
				break;
			}
		}
		sc.close();
	}

}
