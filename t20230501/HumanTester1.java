package t20230501;
//사람 클래스 (ver.3) 사용
public class HumanTester1 {

	public static void main(String[] args) {
		
		Human3 gildong = new Human3("길동", 170, 60, new Day(1975, 3, 12));
		Human3 chulsu = new Human3("철수", 166, 72, new Day(1987, 10, 7));
		
		System.out.println("gildong= " + gildong);
		System.out.println("chulsu= " + chulsu);

	}


}
