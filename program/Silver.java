public class Silver extends Membership {

    
    private static Silver instance;
    
    private Silver() {
        this.withdrawLimit = 7500;
        this.transferLimit = 5000;
    }
    
    public static Silver getInstance() {
        if(instance == null) {
            instance = new Silver();
        }
        return instance;
    }
    
    @Override
    public String toString() {
        return "Silver";
    }
    
    @Override
    public int interestRateCalculation() {
        return 5;
    }
    
    
}