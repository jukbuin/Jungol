package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double yard = sc.nextDouble();
		sc.close();
		System.out.print(yard + "yard = ");
		System.out.printf("%.1f%s", (yard * 91.44), "cm");
	}

}
