package t20230508;

import t20230504.Shape;

public abstract class AbstLine extends Shape {

	private int length;

	public AbstLine(int length) {
		setLength(length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return "AbstLine(length:" + getLength() + ")";
	}

}
