package t20230504;

import t20230502.Day;

//자동차 클래스(총 주행 거리) 사용 예(현재 위치, 연료 잔량, 구입일 표시)
public class ExCarTester1 {
	public static void main(String[] args) {
		ExCar myCar = new ExCar("w221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));
		System.out.printf("현재위치:  (%.2f,%.2f)\n", myCar.getX(), myCar.gety());
		System.out.printf("남은연료:%.2f리터\n", myCar.getFuel());
		System.out.printf("구 입 일:%s\n", myCar.getPurchaseDay());
	}




}
