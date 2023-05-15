package q613;

import java.util.Scanner;

class School {
	String name;
	String school;
	int grade;

	
	School() {
		
	}
	
	School(String n, String s, int g){
		name = n;
		school = s;
		grade = g;

	}
}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();	
//		생성자 이용
		School s1 = new School(name, school,grade);
		
		name = sc.next();
		school = sc.next();
		grade = sc.nextInt();
		School s2 = new School(name, school,grade);
		
//		생성자 없이 생성
//		School s1 = new School();
//		s1.name = name;
//		s1.school = school;
//		s1.grade = grade;
		
		sc.close();
		
		System.out.println("Name : " + s1.name);
		System.out.println("School : " + s1.school);
		System.out.println("Grade : " + s1.grade);
		System.out.println("Name : " + s2.name);
		System.out.println("School : " + s2.school);
		System.out.println("Grade : " + s2.grade);

	}

}
