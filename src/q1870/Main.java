package q1870;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[N][M];
		int cheeze = 0;
		int hour = 0;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				a[i][j] = sc.nextInt();
				if (a[i][j] == 1) {
					cheeze++;
				}
			}
		}
		new Cheeze(a, N, M);

//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				if (a[i][j] == 1) {
//					cnt = (a[i][j - 1] == 0) ? ++cnt : cnt;
//					cnt = (a[i - 1][j] == 0) ? ++cnt : cnt;
//					cnt = (a[i][j + 1] == 0) ? ++cnt : cnt;
//					cnt = (a[i + 1][j] == 0) ? ++cnt : cnt;
//					if (cnt >= 2) {
//						a[i][j] = 5;
//						cnt = 0;
//					}
//				}
//			}
//			++hour;
//		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (a[i][j] == 5) {
					a[i][j] = 0;
					--cheeze;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(cheeze);
		sc.close();
	}

}
