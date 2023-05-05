package t20230503;
//은행 계좌 클래스(ver.3)

import t20230502.Day;

public class Account {
	private static int counter = 0; // 몇 번까지 식별 번호를 부여했는가

	private String name; // 계좌 명의
	private String no; // 계좌 번호
	private long balance; // 예금 잔고
	private Day openDay; // 계좌 개설일
	private int id; // 식별 번호

	// 인스턴스 초기화 블록
	{
		id = ++counter; // 식별 번호
		System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
	}
	

	public Account(String name, String no) {
		this(name,no, 0, new Day());
	}

	public Account(String name, String no, long balance, Day day) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new Day(day);
	}

	public Account(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	// 계좌 명의 확인
	public String getName() {
		return name;
	}

	// 계좌 번호 확인
	public String getNo() {
		return no;
	}

	// 예금 잔고 확인
	public long getBalnace() {
		return balance;
	}

	// 식별 번호가져오기
	public int getId() {
		return id;
	}

	// 계좌 개설일 확인
	public Day getOpenday() {
		return new Day(openDay);
	}

	// k원 입금
	protected void deposit(long k) {
		balance += k;
	}

	// k원 출금
	void withdraw(long k) {
		balance -= k;
	}

//문자열 표현해 의한 꼐좌 기본 정보 반환
	public String toString() {
		return "{" + name + ", " + no + ", " + balance + "}";

	}

}
