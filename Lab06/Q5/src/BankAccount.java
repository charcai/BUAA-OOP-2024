public class BankAccount {
    private long balance;
    BankAccount() {
        balance = 0;
    }
    void deposit(long dep) {
        if(dep < 0) {
            throw new IllegalArgumentException("Deposit less than zero");
        }
        balance += dep;
    }
    void withdraw(long dep) throws InsufficientFundsException {
        if(dep < 0) {
            throw new IllegalArgumentException("Withdraw less than zero");
        }
        if(balance < dep) {
            throw new InsufficientFundsException("Balance not sufficient");
        }
        balance -= dep;
    }
    void printBalance() {
        System.out.println("You have " + balance + "¥ in your account.");
    }
}
