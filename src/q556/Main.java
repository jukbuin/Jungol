package q556;

public class Main {

	public static void main(String[] args) {
//		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		for(int i = 0; i < a.length; i++) {
			if (i < a.length-1) {
			System.out.print(a[i] + " ");
		} else {
			System.out.print(a[i]);
		}
	}
	}
}
