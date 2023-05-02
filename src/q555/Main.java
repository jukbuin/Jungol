package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ar[] = new String[10];
	
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.next();
		} 
		sc.close();
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		} 
	} 

}
