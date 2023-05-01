package q9109;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		sc.close();
//		System.out.print(a);
		String str = "";
		while (true) {
//			char c = sc.next().charAt(0);
			String inp = sc.next();
			char c = inp.charAt(0);

			if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
				str += c;
			} else {
				break;
			}
		}
		System.out.println(str);
	}
}
