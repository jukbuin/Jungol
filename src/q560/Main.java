package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int min = 1000;
//		int min = Integer.MAX_VALUE;     int의 최대값
//		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			min = min < a[i] ? min : a[i];
		}
		sc.close();

		System.out.print(min);
	}

}
