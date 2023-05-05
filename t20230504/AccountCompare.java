package t20230504;

import t20230503.Account;

//is-A 관계와 인스턴스 참조(메서드의 인수로 검증)
public class AccountCompare {
	static int compBalance(Account a, Account b) {
		long totalBalanceA = a instanceof TimeAccount
				? ((TimeAccount) a).getBalnace() + ((TimeAccount) a).getTimeBalance()
				: a.getBalnace();
		long totalBalanceB = b instanceof TimeAccount
				? ((TimeAccount) b).getBalnace() + ((TimeAccount) b).getTimeBalance()
				: b.getBalnace();
		if (totalBalanceA > totalBalanceB)
			return 1;
		else if (totalBalanceA < totalBalanceB)
			return -1;
		return 0;
	}

	public static void main(String[] args) {
		Account gildong = new Account("길동", 123456, 500);
		TimeAccount chulsua = new TimeAccount("철수", "654321", 300, 400);

		System.out.println("길동이와 철수의 예금 잔액 비교 결과입니다.");
		switch (compBalance(gildong, chulsua)) {
		case 0:
			System.out.println("둘의 예금 잔액은 같습니다.");
			break;
		case 1:
			System.out.println("길동이의 예금 잔액이 많습니다.");
			break;
		case -1:
			System.out.println("철수의 예금 잔액이 많습니다..");
			break;

		}

	}

}
