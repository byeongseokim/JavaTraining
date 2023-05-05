package t20230504;
//동물 클래스 (ver.2)

public abstract class Animal2 {
	private String name; // 이름

	public Animal2(String name) { // 생성자
		this.name = name;
	}

	public abstract void bark(); // 짖기

	public String getName() { // 이름 확인
		return name;
	}

	public abstract String toString(); // 문자열 표현 반환 

	public void introduce() {
		System.out.print(toString() + "이다.");
		bark();
	}

}
