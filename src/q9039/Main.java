package q9039;

public class Main {

	public static void main(String[] args) {
		// 1. for문
//		for (char c = 'A'; c <= 'Z'; c++) {
//		System.out.print(c);
//	}
//}
//      2. while문
//		char c = 'A';
//		while (c <= 'Z') {
//			System.out.print(c);
//			c++;
//		}
//		3. do while문
		char c = 'A';
		do {
			System.out.print(c++);
		} while (c <= 'Z');
	}

}
