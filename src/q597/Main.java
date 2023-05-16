package q597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();

		if (str1.length() < 20 && str2.length() < 20) {
			System.out.print(str1.length() + str2.length());
		} else {
			System.out.print("Check the length of the string!");
		}
	}
}
