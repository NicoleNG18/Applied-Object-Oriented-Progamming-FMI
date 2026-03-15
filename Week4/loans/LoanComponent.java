package view;

public class LoanComponent {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public LoanComponent(double annualInterestRate, int numberOfYears, double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
    }

    public double getAnnualInterestRate() { return annualInterestRate; }
    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate; }

    public int getNumberOfYears() { return numberOfYears; }
    public void setNumberOfYears(int numberOfYears) { this.numberOfYears = numberOfYears; }

    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;

        double numerator = loanAmount * monthlyInterestRate;
        double denominator = 1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12));

        return numerator / denominator;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}