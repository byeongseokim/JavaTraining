package t20230503;

import java.time.Year;
import java.util.GregorianCalendar;
import java.util.Random;
import static java.util.GregorianCalendar.*;

public class LuckyDraw2 {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);
		System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n", y, m, d);
		
		Random rand = new Random();
		int k = rand.nextInt(10);
		System.out.print("오늘의 운세는 ");
		switch (k) {
		case 0:
			System.out.print("대길");
			break;
		case 1 : case 2 : case 3: 
			System.out.print("길");
			break;
		case 4 : case 5 : case 6: 
			System.out.print("중길");
			break;
		case 7 : case 8 :
			System.out.print("소길");
			break;
		case 9 :
			System.out.print("흉");
			break;
			

		}
		System.out.println("입니다.");
	}

}
