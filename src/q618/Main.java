package q618;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static String[] name(String[] name) {
		Arrays.sort(name);
		return name;
	}

	public static void fname(String[] n, String[] name2, int[] height, Double[] weight) {
		System.out.println("name");
		for (int i = 0; i < name2.length; i++) {
			System.out.print(n[i] + " ");
			for (int j = 0; j < name2.length; j++) {
				if (name2[j] == n[i]) {
					System.out.print(height[j] + " ");
					System.out.println(weight[j]);
				}
			}
		}
		System.out.println();
	}

	public static Double[] weight(Double[] weight) {
		Arrays.sort(weight, Collections.reverseOrder());
		return weight;
	}

	public static void hweight(Double[] w, String[] name, int[] height, Double[] weight2) {
		System.out.println("weight");
		for (int i = 0; i < weight2.length; i++) {

			for (int j = 0; j < weight2.length; j++) {
				if (w[i] == weight2[j]) {
					System.out.print(name[j] + " ");
					System.out.print(height[j] + " ");
					System.out.println(w[i] + " ");

				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		int height[] = new int[5];
		Double weight[] = new Double[5];

		for (int i = 0; i < name.length; i++) {
			name[i] = sc.next();
			height[i] = sc.nextInt();
			weight[i] = sc.nextDouble();
		}
		sc.close();
		String name2[] = Arrays.copyOf(name, name.length);
		Double weight2[] = Arrays.copyOf(weight, weight.length);
		name(name);
		fname(name, name2, height, weight);
		weight(weight);
		hweight(weight, name2, height, weight2);
	}

}
