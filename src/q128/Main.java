package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			} else if (num % 3 != 0 && num % 5 != 0) {
				cnt++;
			}
		}
		sc.close();
		System.out.print(cnt);
	}

}
