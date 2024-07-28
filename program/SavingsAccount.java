public class SavingsAccount extends UserAccount {
    public SavingsAccount(int accountNumber, double availableBalance, double totalBalance, Membership membership) {
        super(accountNumber, availableBalance, totalBalance, membership);
    }
    
    @Override
    public int interestRateCalculation() {
        return membership.interestRateCalculation();
    }
}