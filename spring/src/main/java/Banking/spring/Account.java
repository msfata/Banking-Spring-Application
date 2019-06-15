package Banking.spring;

public class Account {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void transfer(Account from, Account to, int amount) {
		from.balance-=amount;
		to.balance+= amount;
	}
}
