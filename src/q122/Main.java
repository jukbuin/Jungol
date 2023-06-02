package q122;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0)) {
			System.out.print("leap year");
		} else {
			System.out.print("common year");
		}
	}

}
