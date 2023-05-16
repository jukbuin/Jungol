package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int i = 0;
		int min = 1000;
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		for (i = 0; i < a.length; i++) {
			min = min < a[i] ? min : a[i];
		}
		System.out.print(min);
	}

}
