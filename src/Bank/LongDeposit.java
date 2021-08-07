package Bank;

public class LongDeposit extends Deposit {

    double sum;

    LongDeposit(double depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    void income() {
        sum = depositAmount;
        for(int i = 6; i < depositPeriod; i++){
            sum = sum * 1.15;
        }
    }

    void printIncome(){
        System.out.println("Доход по базовому депозиту за " + depositPeriod + " мес. составит " +
                (sum-depositAmount) + "$. При сумме вклада " + depositAmount + "$.");
    }
}
