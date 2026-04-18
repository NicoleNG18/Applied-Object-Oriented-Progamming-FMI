package savings;

public class SavingsAccount {

    private static double mAnnualInterestRate = 0.0;
    private static int sNextId = 1001;

    private int mNumber;
    private double mSavingsBalance;

    public SavingsAccount() {
        this(0.0);
    }

    public SavingsAccount(double initialBalance) {
        this.mNumber = sNextId++;
        setSavingsBalance(initialBalance);
    }

    public SavingsAccount(SavingsAccount other) {
        this.mNumber = sNextId++;
        setSavingsBalance(other.mSavingsBalance);
    }

    public static void modifyInterestRate(double newRate) {
        if (newRate >= 0) {
            mAnnualInterestRate = newRate;
        }
    }

    public static double getAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public void setSavingsBalance(double balance) {
        this.mSavingsBalance = (balance >= 0) ? balance : 0;
    }

    public double getSavingsBalance() {
        return mSavingsBalance;
    }

    public int getNumber() {
        return mNumber;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (mSavingsBalance * mAnnualInterestRate) / 12;
        mSavingsBalance += monthlyInterest;
    }

    public boolean isGreater(SavingsAccount acc) {
        if (acc == null) return true;
        return this.mSavingsBalance > acc.mSavingsBalance;
    }

    @Override
    public String toString() {
        return String.format("Account No: %d | Balance: %.2f | Annual Interest: %.2f%%",
                mNumber, mSavingsBalance, mAnnualInterestRate * 100);
    }
}
