package q9038;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		int max = n1 > n2 ? n1 : n2;
		System.out.print(max);
	}

}
