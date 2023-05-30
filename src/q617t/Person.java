package q617t;

public class Person {
	private String name;
	private int height;

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

//	get method()
	public void print() {
		System.out.print(name + " " + height);
	}

	public int getHeight() {
		return height;
	}
}
