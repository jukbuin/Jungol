package q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int c = a + 100;
		int d = b%10;
		System.out.print(c + " ");
		System.out.print(d);
	}

}
