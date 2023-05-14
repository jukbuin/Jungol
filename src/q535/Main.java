package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();

		switch ((int) score) {
		case (int) 4.0:
			System.out.print("scholarship");
			break;
		case (int) 3.0:
			System.out.print("next semester");
			break;
		case (int) 2.0:
			System.out.print("seasonal semester");
			break;
		default:
			System.out.print("retake");
			break;
		}

	}
}