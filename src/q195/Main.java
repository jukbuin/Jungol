package q195;

import java.util.Scanner;

class Info {

	private String name;
	private String tel;
	private String addr;

	Info() {
	}

	Info(String name, String tel, String addr) {
		if (name.length() < 100 && tel.length() < 100 && addr.length() < 100) {
			this.name = name;
			this.tel = tel;
			this.addr = addr;
		} else {
			this.name = null;
			this.tel = null;
			this.addr = null;
			return;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 100) {
			this.name = null;
			return;
		}
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel.length() > 100) {
			this.name = null;
			return;
		}
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		if (addr.length() > 100) {
			this.name = null;
			return;
		}
		this.addr = addr;
	}

	public void str() {
		System.out.println("name : " + this.name);
		System.out.println("tel : " + this.tel);
		System.out.println("addr : " + this.addr);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		sc.close();

//		Info myInfo = new Info();
//		myInfo.setName(name);
//		myInfo.setTel(tel);
//		myInfo.setAddr(addr);
//		
//		System.out.println("name : " + myInfo.getName());
//		System.out.println("tel : " + myInfo.getTel());
//		System.out.println("addr : " + myInfo.getAddr());

		Info info = new Info(name, tel, addr);
		info.str();
	}

}
