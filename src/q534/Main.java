package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char al = sc.next().charAt(0);
		sc.close();
		
//		1.switch문

		switch (al) {
		case 'A':
			System.out.print("Excellent");
			break;
		case 'B':
			System.out.print("Good");
			break;
		case 'C':
			System.out.print("Usually");
			break;
		case 'D':
			System.out.print("Effort");
			break;
		case 'F':
			System.out.print("Failure");
			break;
		default:
			System.out.print("error");
		}
		
//		2.if~else문
		
//		if (al == 'A') {
//			System.out.print("Excellent");
//		} else if (al == 'B') {
//			System.out.print("Good");
//		} else if (al == 'C') {
//			System.out.print("Usually");
//		} else if (al == 'D') {
//			System.out.print("Effort");
//		} else if (al == 'F') {
//			System.out.print("Failure");
//		} else {
//			System.out.print("error");
//		}
	}

}
