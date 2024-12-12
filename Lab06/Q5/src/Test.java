public class Test {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.printBalance();
        a.deposit(100);
        a.printBalance();
        a.deposit(200);
        a.printBalance();
        try {
            a.withdraw(250);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        a.printBalance();
        try {
            a.withdraw(250);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        a.printBalance();
    }
}
