package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();

		if (gender == 'M' && age >= 18) {
			System.out.print("MAN");
		} else if (gender == 'M' && age < 18) {
			System.out.print("BOY");
		} else if (gender == 'F' && age >= 18) {
			System.out.print("WOMAN");
		} else {
			System.out.print("GIRL");
		}
	}

}
