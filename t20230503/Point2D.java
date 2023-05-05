package t20230503;
//당첨 기능을 가진 2차원 자표 클래스 point2D

import java.util.GregorianCalendar;

public class Point2D {
	private static int counter = 0; // 몇 번까지 식별 번호를 부여했는가
	private static int day; // 오늘 날짜

	private int x = 0; // x좌표
	private int y = 0; // y좌표

	// 클래스 초기화 블록
	static {
		GregorianCalendar today = new GregorianCalendar(); // 현재 날짜
		day = today.get(day); // today의 일
	}

	// 인스턴스 초기화 블록
	{
		if (++counter == day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d 개의 좌표가 생성됐습니다.\n", counter);
		}
	}

	public Point2D() {
	}

	public Point2D(int x) {
		this.x = x;
	}

	public Point2D(int x, int y) { this.x = x; this.y = y; } 
	{this.x=x; this.y=y;}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static int getCounter() {
		return counter;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";

	}

}
