package t20230503;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

import java.security.PublicKey;

public class DateId {

	private static int counter;
	private int id;

	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);

		System.out.printf("오늘은 %04d년 %02d월 %02d일 입니다.\n", y, m, d);

		counter = y + 1000000 + m * 10000 + d + 100;
	}

	public DateId() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

}
