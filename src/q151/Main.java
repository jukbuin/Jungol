package q151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		System.out.print(num[0] + num[2] + num[4]);
	}

}
