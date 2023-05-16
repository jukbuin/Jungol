package q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

//		if (a >= b) {
//			System.out.print(a - b);
//		} else {
//			System.out.print(b - a);
//		}
		System.out.print(a > b ? a - b : b - a);
	}

}
