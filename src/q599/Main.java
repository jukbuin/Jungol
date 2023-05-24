package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		sc.close();

		if (a.length() <= 100) {
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				if (c >= 'A' && c <= 'Z') {
					System.out.print(c);
				} else if (c >= 'a' && c <= 'z') {
					System.out.print((char) (c - 32));
				}
			}
		}
	}

}
