package q571;

import java.util.Scanner;

class Str {
	void str(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("~!@#$^&*()_+|");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		Str myStr = new Str();
		myStr.str(num);

	}

}
