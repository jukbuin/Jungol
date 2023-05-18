package q525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int min = 0;
		min = a > b ? a : b;
		System.out.print(min > c ? 1 + " " : 0 + " ");
		System.out.print(a == b && b == c && a == c ? 1 : 0);
	}

}
