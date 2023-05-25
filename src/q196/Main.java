package q196;

import java.util.Scanner;

class Info {

	String name;
	String tel;
	String addr;

	Info(String name, String tel, String addr) {
		if (name.length() < 16 && tel.length() < 16 && addr.length() < 16) {
			this.name = name;
			this.tel = tel;
			this.addr = addr;
		} else {
			System.out.println("15자 이하로 적어주세요.");
		}
	}

	public void print() {
		System.out.println("name : " + this.name);
		System.out.println("tel : " + this.tel);
		System.out.println("addr : " + this.addr);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Info[] i = new Info[3];
		for (int j = 0; j < i.length; j++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			i[j] = new Info(name, tel, addr);
		}
		sc.close();
//		String name = sc.next();
//		String tel = sc.next();
//		String addr = sc.next();
//		System.out.println();
//
//		Info info = new Info(name, tel, addr);
//
//		name = sc.next();
//		tel = sc.next();
//		addr = sc.next();
//		Info info2 = new Info(name, tel, addr);
//
//		name = sc.next();
//		tel = sc.next();
//		addr = sc.next();
//		Info info3 = new Info(name, tel, addr);

//		sc.close();

		if (i[0].name.charAt(0) < i[1].name.charAt(0) && i[0].name.charAt(0) < i[2].name.charAt(0)) {
			i[0].print();
		} else if (i[1].name.charAt(0) < i[0].name.charAt(0) && i[1].name.charAt(0) < i[2].name.charAt(0)) {
			i[1].print();
		} else {
			i[2].print();
		}

	}

}
