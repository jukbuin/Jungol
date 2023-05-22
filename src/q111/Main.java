package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int d = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			int inp = sc.nextInt();
			sum += inp;
		}
		sc.close();

		System.out.println("sum " + sum);
		System.out.print("avg " + sum / 4);
	}

}
