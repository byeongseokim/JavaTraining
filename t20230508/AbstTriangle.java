package t20230508;

import t20230504.Shape;

public abstract class AbstTriangle extends Shape {

	private int length;

	public AbstTriangle(int length) {
		setLength(length);
	}

	public void setLenght(int lenght) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return "AbstTriangle(length:" + length + ")";
	}

}
