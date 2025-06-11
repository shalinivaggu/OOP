class BankAccount {
    private double balance;
    protected String accountType;
    double interestRate = 2.5;
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest earned: $" + interest);
    }

    public double getBalance() {
        return balance;
    }
    
}

class SavingsAccount extends BankAccount {
   
    public SavingsAccount() {
        accountType = "Savings";
    }

    public void showAccountType() {
        System.out.println("Account Type: " + accountType);
    }

    public void printInterestInfo() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public void printBalance() {
        System.out.println("Balance: $" + getBalance());
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount();
        
        mySavings.deposit(1000);
        mySavings.withdraw(200);
        mySavings.calculateInterest();
        
        mySavings.showAccountType();
        mySavings.printInterestInfo();
        mySavings.printBalance();
        
        System.out.println("Final Balance: $" + mySavings.getBalance());
    }
}
