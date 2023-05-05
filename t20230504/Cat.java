package t20230504;

public class Cat extends Animal {
	private int age; // 나이

	public Cat(String name, int age) { // 생성자
		super(name);
		this.age = age;
	}

	public void bark() {
		System.out.println("냐옹!"); // 짖기
	}

}
