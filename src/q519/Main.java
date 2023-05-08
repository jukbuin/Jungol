package q519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();

		System.out.print(s1 + " ");
		System.out.print(s2);

//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
//
//		a += 100;
//		b %= 10;
////		int c = a + 100;
////		int d = b % 10;
//		System.out.print(a + " ");
//		System.out.print(b);
	}

}
