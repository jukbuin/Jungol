package q563t;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		
		for(int j = 0; j < ar.length; j++) {
			int max = Integer.MIN_VALUE;
			int idx = 0;
			for(int i = 0; i < ar.length; i++) {
				if(max < ar[i]) {
					max = ar[i];
					idx = i;
				}
			}
			System.out.print(max + " ");
			ar[idx] = -1;
		}
	}

}
