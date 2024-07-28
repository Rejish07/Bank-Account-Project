public class CurrentAccount extends UserAccount {
    public CurrentAccount(int accountNumber, double availableBalance, double totalBalance, Membership membership) {
        super(accountNumber, availableBalance, totalBalance, membership);
    }
    
    @Override
    public int interestRateCalculation() {
        return 0;
    }
}