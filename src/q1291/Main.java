package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			if ((s < 2 || s > 9) || (e < 2 || e > 9)) {
				System.out.println("INPUT ERROR!");
				continue;
			}
			for (int n = 1; n < 10; n++) {
				for (int i = s; i <= e; i++) {
					System.out.printf("%d * %d = %2d   ", i, n, (i * n));
					if (i == e) {
						System.out.println();
					}
				}
				if (s == e) {
					continue;
				}
				for (int i = s; i >= e; i--) {
					System.out.printf("%d * %d = %2d   ", i, n, (i * n));
					if (i == e) {
						System.out.println();
					}
				}
			}

			if ((s > 1 && s < 10) && (e > 1 && e < 10)) {
				break;
			}
		}
		sc.close();
	}
}
