package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] c = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();		

		System.out.printf("%.1f", (c[a-1]+c[b-1]));

	}

}
