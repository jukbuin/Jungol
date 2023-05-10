package q522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

//		if (a == b) {
//			System.out.println(1);
//		} else {
//			System.out.println(0);
//		}
//		if (a != b) {
//			System.out.println(1);
//		} else {
//			System.out.println(0);
//		}
		
		int c = (a == b) ? 1 : 0;
		System.out.println(c);
		int d = !(a == b) ? 1 : 0;
		System.out.println(d);
		

	}

}
