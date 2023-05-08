package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		char[] al = new char[10];
		for (i = 0; i < al.length; i++) {
			al[i] = sc.next().charAt(0);
		}
		sc.close();
		System.out.printf("%c %c %c", al[0], al[3], al[6]);
	}

}
