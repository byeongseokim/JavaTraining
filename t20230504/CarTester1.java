package t20230504;

import t20230502.Day;

//is-A 관계와 인스턴스 참조
public class CarTester1 {
	public static void main(String[] args) {
		Car car1 = new ExCar("W140", 1885, 1490, 5220, 95.0, new Day(2018, 10, 13));
		ExCar car2 = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));

		Car x;
		x = car1;
		x = car2;

		System.out.println("x구입일:" + x.getPurchaseDay());

		ExCar y;
		// y = car1;   //상위 클래스형으 ㅣ인스턴스는 참조할수 없다
		y = car2;

		System.out.println("y구입일:" + y.getPurchaseDay());
		System.out.println("y의 총 주행 거리:" + y.getTotalMileage());

	}

}
