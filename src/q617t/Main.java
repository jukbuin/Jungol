package q617t;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];

		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();

			p[i] = new Person(name, height);

		}
		sc.close();

		Person min = p[0];
		for (int i = 0; i < p.length; i++) {
			if (min.getHeight() > p[i].getHeight()) {
				min = p[i];
			}
		}
		min.print();
	}
}