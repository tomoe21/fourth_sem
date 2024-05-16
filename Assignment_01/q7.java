public abstract class Account {
	
	private int accountNo;
	private double balance;
	
	public Account(int accountNo,double balance) {
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo=accountNo;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	
	public abstract void deposit(double amount);
	public abstract void withdrawl(double amount);
	
}
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount sa=new SavingsAccount(1234,0);
		sa.withdrawl(34);
		sa.deposit(15000);
		
		System.out.println(sa.getBalance());
		
		SavingsAccount sa2=new SavingsAccount(3456,0);
		sa2.deposit(15000);
		sa2.deposit(15000);
		
		System.out.println(sa.getBalance());
		System.out.println(sa2.getBalance());
	}

}
public class CurrentAccount extends Account {
	
	double overdraftLimit;
	
	public CurrentAccount(int accountNo, double balance) {
		super(accountNo, balance);
	}

	
	public void deposit(double amount) {
		
	}
	public void withdrawl(double amount) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
public class SavingsAccount extends Account{
	
	final double interestRate=7.5;
	
	public SavingsAccount(int accountNo, double balance) {
		super(accountNo,balance);
	}
	
	@Override
	public void deposit(double amount) {
		setBalance(amount+getBalance());
		System.out.println("Interest is:"+0.075*amount);
	}
	
	@Override
	public void withdrawl(double amount) {
		if(amount>getBalance()) {
			System.out.println("Insufficient balance.");
		}else {
			setBalance(getBalance()-amount);
		}
	}

}
