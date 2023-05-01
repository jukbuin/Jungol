package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
//		1.for문
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//      2.while문
//		int sum2 = 0;
//		int i2 = 0;
//		while(i2 <= num) {
//			sum2 += i2++;
//		}
//		System.out.println(sum2);
		
//		3.do while문
		int sum3 = 0;
		int i3 = 0;
		do {
			sum3 += i3++;
		} while (i3 <= num);
		System.out.println(sum3);
	}

}
