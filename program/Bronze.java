public class Bronze extends Membership {
    
    private static Bronze instance;

    private Bronze() {
        this.withdrawLimit = 5000;
        this.transferLimit = 2500;
    }
    
    public Bronze getInstance() {
        if(instance == null) {
            instance = new Bronze();
        }
        return instance;
    }
    
    @Override
    public String toString() {
        return "Bronze";
    }
    
    @Override
    public int interestRateCalculation() {
        return  3;
    }
    
    
}