package q563;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num[] = new Integer[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(num, Collections.reverseOrder());
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}