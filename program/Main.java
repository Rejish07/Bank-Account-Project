
public class Main
{
	public static void main(String[] args) {
		Membership membership1 = Gold.getInstance();
		
		UserAccount account1 = new SavingsAccount(11111, 100000.0, 100000.0, membership1);
		System.out.println("account1 totalBalance : " + account1.totalBalance);
		account1.credit(3000);
		System.out.println("account1 interestRate : " + account1.interestRateCalculation());
		account1.debit(5000);
		System.out.println("account1 totalBalance : " + account1.totalBalance);
		account1.printDetails();
		
		
		Membership membership2 = Silver.getInstance(); 
		
		UserAccount account2 = new SavingsAccount(22222, 10000.0, 10000.0, membership2);
		System.out.println("account2 totalBalance : " + account2.totalBalance);
		account2.credit(3000);
		System.out.println("account2 interestRate : " + account2.interestRateCalculation());
		account2.debit(5000);
		System.out.println("account2 totalBalance : " + account2.totalBalance);
		account2.printDetails();
	}
}