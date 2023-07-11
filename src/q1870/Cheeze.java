package q1870;

public class Cheeze {

	public  Cheeze(int a[][], int N, int M) {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (a[i][j] == 1) {
					cnt = (a[i][j - 1] == 0) ? ++cnt : cnt;
					cnt = (a[i - 1][j] == 0) ? ++cnt : cnt;
					cnt = (a[i][j + 1] == 0) ? ++cnt : cnt;
					cnt = (a[i + 1][j] == 0) ? ++cnt : cnt;
					if (cnt >= 2) {
						a[i][j] = 5;
						cnt = 0;
					}
				}
			}
		}
		System.out.println(a);
	}
}
