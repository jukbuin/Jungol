package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			for (int i = 1; a % 3 == 0; i++) {
				System.out.println(a / 3);
				if (i == 1) {
					break;
				}
			}
			if (a == -1) {
				break;
			}
		}
		sc.close();
	}

}
