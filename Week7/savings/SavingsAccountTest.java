package savings;

public class SavingsAccountTest {
    static void main() {
        SavingsAccount.modifyInterestRate(0.04);

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        System.out.println("Initial accounts:");
        System.out.println("Saver 1: " + saver1);
        System.out.println("Saver 2: " + saver2);

        compareAccounts(saver1, saver2);

        SavingsAccount saver3 = new SavingsAccount(saver2);
        System.out.println("\nCreated Saver 3 as copy of Saver 2:");
        System.out.println("Saver 3: " + saver3);

        compareAccounts(saver2, saver3);

        System.out.println("\nCalculating monthly interest for Saver 1...");
        saver1.calculateMonthlyInterest();
        System.out.println("New Saver 1 balance: " + saver1.getSavingsBalance());
    }

    public static void compareAccounts(SavingsAccount a, SavingsAccount b) {
        if (a.isGreater(b)) {
            System.out.println("Account " + a.getNumber() + " has more money than " + b.getNumber());
        } else if (b.isGreater(a)) {
            System.out.println("Account " + b.getNumber() + " has more money than " + a.getNumber());
        } else {
            System.out.println("Both accounts " + a.getNumber() + " and " + b.getNumber() + " have equal balances.");
        }
    }
}
