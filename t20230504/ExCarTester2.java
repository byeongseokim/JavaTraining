package t20230504;

import t20230502.Day;

//자동차 클래스 (총 주행 거리) 사용예 (사양 표시)
public class ExCarTester2 {
	public static void main(String[] args) {
		ExCar myCar = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015,12,24));
		myCar.putSepc();  //사양표시

	}

}
