package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		String str2 = str + str;
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str2.substring(i, i + str.length()));
		}

//		for (int i = str.length() - 1; i >= 0; i--) {
//			for (int j = i; j < str.length(); j++) {
//				System.out.print(str.charAt(j));
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print(str.charAt(k));
//				if (k == i - 1) {
//					System.out.println();
//				}
//			}
//		}
	}

}
