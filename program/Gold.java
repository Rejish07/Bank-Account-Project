public class Gold extends Membership {
    private static Gold instance;
    
    private Gold() {
        this.withdrawLimit = 10000;
        this.transferLimit = 5000;
    }
    
    public static Gold getInstance() {
        if(instance == null) {
            instance = new Gold();
        }
        return instance;
    }
    
    @Override
    public String toString() {
        return "Gold";
    }
    
    @Override
    public int interestRateCalculation() {
        return 8;
    }

}