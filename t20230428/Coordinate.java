package t20230428;
//2차원 좌표 클래스(ver.1)

public class Coordinate {
	private double x;      //x좌표
	private double y;      //y좌표
	
	
	//---생성자---//
	public Coordinate(double x, double y) {
		this.x = x;         
		this.y = y;
	}
	
	double getX() { return x;}     //x좌표 가져오기
	double getY() { return y;}     //y좌표 가져오기
	
	
	void setX(double x) { this.x = x; }  //x좌표 설정
	void setY(double y) { this.y = y; }  //x좌표 설정
	
	
	void set (double x, double y) { this.x = x; this.y = y;}      //좌표 설정
	
	
	
	

}
