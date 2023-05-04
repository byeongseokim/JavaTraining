package t20230504;

import t20230502.Day;

//자동차 클래스 사용 예 (다형성 검증)
public class CarTester2 {
	public static void main(String[] args) {
		Car car1 = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));
		car1.putSpec(); // 사양표시
	}

}
