package q150;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char num[] = new char[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.next().charAt(0);
		}
		sc.close();

		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}

}
