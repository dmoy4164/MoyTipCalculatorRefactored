public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip = 0.0;

        public TipCalculator (int numPeople, double tipPercentage, double totalBillBeforeTip){
            this.numPeople = numPeople;
            this.tipPercentage = tipPercentage;
            this.totalBillBeforeTip = totalBillBeforeTip;
        }
    public double getTotalBillBeforeTip(){
            return totalBillBeforeTip;
    }
    public double getTipPercentage(){
            return tipPercentage;
    }
    public double addMeal(double cost){
            return (totalBillBeforeTip + cost);
    }
    public double tipAmount() {
            return (tipPercentage * totalBillBeforeTip);
    }
    public double totalBill() {
            return (totalBillBeforeTip + tipAmount());
    }
    public double perPersonCostBeforeTip(){
            return (totalBillBeforeTip/numPeople);
    }
    public double perPersonTipAmount(){
            return (tipAmount()/numPeople);
    }
    public double perPersonTotalCost(){
            return (totalBill()/numPeople);
    }
}
