package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
		int[] num = new int[3];
		for(int i = 0;i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		

//		int sum = num1 + num2 + num3;
//		double avg = sum / 3;
//		System.out.println("sum : " + sum);
//		System.out.printf("avg : %.0f", avg);

		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];  //합계
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum / num.length));
	}

}
