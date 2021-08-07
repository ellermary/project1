package Bank;

public class BaseDeposit extends Deposit {

    double sum;

    BaseDeposit(double depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    void income() {
        sum = depositAmount;
        for(int i = 0; i < depositPeriod; i++){
            sum = sum * 1.05;
        }
    }

    void printIncome(){
        System.out.println("Доход по базовому депозиту за " + depositPeriod +
                " мес. составит: " + (sum-depositAmount) + "$. При сумме вклада " + depositAmount + "$.");
    }
}
