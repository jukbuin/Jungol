package q9024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		System.out.print(a > b ? 1 + " " : 0 + " ");
		System.out.print(b >= c ? 1 + " " : 0 + " ");
		System.out.print(a <= b ? 1 + " " : 0 + " ");
		System.out.print(b < c ? 1 + " " : 0 + " ");
	}

}