package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int sum = a + b + c + d;

		System.out.println("sum " + sum);
		System.out.print("avg " + sum / 4);
	}

}
