package Bank;

public class SpecialDeposit extends Deposit {

    double sum;
    int months;

    SpecialDeposit(double depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    void income() {
        sum = depositAmount;
        months = 1;
        for(int i = 0; i < depositPeriod; i++) {
            sum = sum * (1 + 0.01 * months);
            months++;
        }
    }
    void printIncome(){
        System.out.println("Доход по базовому депозиту за " + depositPeriod + " мес. составит " +
                (sum-depositAmount) + "$. При сумме вклада " + depositAmount + "$.");
    }
}
