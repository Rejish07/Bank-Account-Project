abstract class Membership {
    protected int withdrawLimit;
    protected int transferLimit;
    
    public int getWithdrawLimit() {
        return withdrawLimit;
    }
    
    public int getTransferLimit() {
        return transferLimit;
    }
    
    public abstract int interestRateCalculation();
    
    
}