package q618;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void Name(String[] name, int[] height, double[] weight) {
//		Arrays.sort(name);
		
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		int height[] = new int[5];
		double weight[] = new double[5];
		
		for(int i = 0; i < name.length; i++) {
			name[i] = sc.next();
			height[i] = sc.nextInt();
			weight[i] = sc.nextDouble();
		}
		sc.close();
		Name(name, height, weight);
		System.out.print(name);
	}

}
