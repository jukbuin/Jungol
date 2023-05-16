package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char ar = sc.next().charAt(0);
			if (ar >= 'A' && ar <= 'Z' || ar >= 'a' && ar <= 'z') {
				System.out.println(ar);
			} else if (ar >= 48 && ar <= 57) {
				System.out.println((int) ar);
			} else {
				break;
			}
			
//			if(Character.isAlphabetic(ar)) {
//				System.out.println(ar);
//			} else if(Character.isDigit(ar)) {
//				System.out.println((int)ar);
//			} else {
//				break;
//			}
		}
		sc.close();
	}

}
