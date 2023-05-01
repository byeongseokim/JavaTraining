package t20230501;
//은행 계좌 클래스 (ver.2) 사용
public class AccountTester1 {
	public static void main(String[] args) {
		Day d = new Day(2010, 10, 15);
		Account2 gildong = new Account2 ("길동", "125768", 100, d);
		
		Day p = gildong.getOpenDay();
		System.out.println("계좌 개설일:" + p);
		
		p.set(1999, 12, 31);         //개설일을 변경한다?
		
		
		Day q = gildong.getOpenDay();
		System.out.println("계좌 개설일:" + q);

	}

}
