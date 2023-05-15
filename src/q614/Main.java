package q614;

import java.util.Scanner;

class School {
	String name;
	int grade;

	School(String n, int g) {
		grade = g;
		name = n;
	}

//	School() {
//		name = "Jejuelementary";
//		grade = 6;
//	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int grade = sc.nextInt();
		sc.close();

//		School s1 = new School();
//		System.out.println(s1.grade + " grade in " + s1.name + " School");

		School s1 = new School("Jejuelementary", 6);
		System.out.println(s1.grade + " grade in " + s1.name + " School");
		
		School s2 = new School(name, grade);
		System.out.print(s2.grade + " grade in " + s2.name + " School");
	}

}
