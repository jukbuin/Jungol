package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
//		System.out.println(a + " * " + b + " = " + (a * b));
//		System.out.print(a + " / " + b + " = " + (a / b));
		
		

		if(a >= b) {
//			1. a >= b
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.print(a + " / " + b + " = " + (a / b));
		} else {
//			2. a <= b
//			'swap'
			int tmp = a;
			a = b;
			b= tmp;
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.print(a + " / " + b + " = " + (a / b));
		}
	}

}
