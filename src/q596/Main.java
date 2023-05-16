package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		sc.close();
		
		if (a.length() > b) {
			for (int i = a.length(); i > a.length() - b; i--) {    //(int i = a.lenght()-1; (num > 0 && i >= 0; i--, num--)
				System.out.print(a.charAt(i - 1));                 // System.out.print(a.charAt(i));
			}
		} else {
			for (int i = a.length(); i > 0; i--) {
				System.out.print(a.charAt(i - 1));
			}
		}

	}

}
