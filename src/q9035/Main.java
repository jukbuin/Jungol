package q9035;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num[] = new Integer[3];
		System.out.print("세 수를 입력하세요. ");

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(num, Collections.reverseOrder());
		System.out.print("입력받은 수중 가장 큰 수는 " + num[0] + "입니다.");
	}

}
