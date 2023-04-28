package t20230428;
//2차원 좌표 클래스 coordinate(ver.2)

public class Coordinate2 {
	private double x = 0.0;       //X좌표
	private double y = 0.0;       //Y좌표
	
	
	//---생성자---//
	public Coordinate2() {}
	public Coordinate2(double x, double y) { set(x,y); }
	public Coordinate2(Coordinate2 c) { this(c.x, c.y); }
	
	
	public double getX() { return x; }       //X좌표 가져오기
	public double getY() { return y; }       //Y표 가져오기
	
	
	public void setX(double x) { this.x = x; }  //X좌표 설정
	public void setY(double y) { this.y = y; }  //Y좌표 설정
	
	public void set(double x, double y) { this.x = x; this.y = y; }  //좌표 설정
	
	
	public boolean equalTo(Coordinate2 c) { return x == c.x && y == c.y; }
	
	
	public String toString() { return "(" + x + ", " + y + ")"; }
 
}
