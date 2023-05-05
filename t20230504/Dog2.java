package t20230504;

//개 클래스(ver.2)
 class Dog2 extends Animal2 {
	private String type;

	public Dog2(String name, String type) { // 생성자
		super(name);
		this.type = type;
	}

	public void bark() {
		System.out.println("멍멍!"); // 짖기
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type + "의 " + getName();
	}

	
	

}
