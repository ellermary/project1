package Bank;

public abstract class Deposit {

    public double depositAmount;
    public int depositPeriod; //in months

    Deposit(double depositAmount, int depositPeriod) {
        this.depositAmount = depositAmount;
        this.depositPeriod = depositPeriod;
    }

    abstract void income(); //returns money value – amount of income from deposit.
    // Income is the difference between sum, withdrawn from deposit upon
    // expiration date and deposited sum.


}
