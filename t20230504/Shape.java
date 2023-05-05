package t20230504;

public abstract class Shape {
	public abstract String toString();

	public abstract void draw();

	public void print() {
		System.out.println(toString());
		draw();
	}

}
