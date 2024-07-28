abstract class UserAccount {
    protected int accountNumber;
    protected double availableBalance;
    protected double totalBalance;
    protected Membership membership;
    
    UserAccount(int accountNumber, double availableBalance, double totalBalance, Membership membership) {
        this.accountNumber = accountNumber;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
        this.membership = membership;
    }
    
    public int getWithdrawLimit() {
        return membership.getWithdrawLimit();
    }
    
    public int getTransferLimit() {
        return membership.getTransferLimit();
    }
    
    public void credit(int amount) {
        availableBalance += amount;
        totalBalance += amount;
    }
    
    public void debit(int amount) {
        if(amount < availableBalance) {
            availableBalance -= amount;
            totalBalance -= amount;
        }
        else {
            System.out.println("you don't have enough Balance");
        }
    }
    
    public void printDetails() {
        System.out.println("AccountNumber : " + this.accountNumber + "\t" + "Total Balance : " + this.totalBalance + "\t" + "Membership : " + membership.toString());
    }
    
    public abstract int interestRateCalculation();
    
}