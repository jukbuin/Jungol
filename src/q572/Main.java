package q572;

import java.util.Scanner;

class Area {
	void radius(int rd) {
		System.out.printf("%.2f", (double)rd * rd * 3.14);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rd = sc.nextInt();
		sc.close();

		Area cd = new Area();
		cd.radius(rd);
	}

}
