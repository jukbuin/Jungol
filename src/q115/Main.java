package q115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mT = sc.nextInt();
		int mW = sc.nextInt();
		int gT = sc.nextInt();
		int gW = sc.nextInt();
		sc.close();

		System.out.print(mT > gT && mW > gW ? 1 : 0);
	}

}
