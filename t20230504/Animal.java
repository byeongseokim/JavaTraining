package t20230504;
//동물 클래스 (ver.1)

public abstract class Animal {
	private String name; // 이름

	protected Animal(String name) { // 생성자
		this.name = name;
	}

	public abstract void bark(); // 짖기

	public String getName() { // 이름 확인
		return name;
	}

}