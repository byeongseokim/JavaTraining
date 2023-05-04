package t20230504;

import t20230503.Account;

class TimeAccount extends Account {
	private long timeBalance;
	private long balance;

	
	
	public TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no);
		this.timeBalance = timeBalance;
	}
	
	long getTimeBalance() {
		return timeBalance;
	}
	
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}

}
