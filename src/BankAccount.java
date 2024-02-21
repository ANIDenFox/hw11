public class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean isBlocked;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.isBlocked = false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void deposit(double amount) {
        if (!isBlocked) {
            balance += amount;
            System.out.println("До рахунку " + accountNumber + " додано: " + amount);
            System.out.println("Загальний залишок: " + balance);
        } else {
            System.out.println("Рахунок " + accountNumber + " заблоковано. Операція неможлива.");
        }
    }

    public void withdraw(double amount) {
        if (!isBlocked && balance >= amount) {
            balance -= amount;
            System.out.println("З рахунку " + accountNumber + " знято: " + amount);
            System.out.println("Загальний залишок: " + balance);
        } else if (isBlocked) {
            System.out.println("Рахунок " + accountNumber + " заблоковано. Операція неможлива.");
        } else {
            System.out.println("Недостатньо коштів на рахунку " + accountNumber + ". Операція неможлива.");
        }
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (!isBlocked && balance >= amount) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Переведено " + amount + " з рахунку " + accountNumber + " на рахунок " + targetAccount.getAccountNumber());
        } else if (isBlocked) {
            System.out.println("Рахунок " + accountNumber + " заблоковано. Операція неможлива.");
        } else {
            System.out.println("Недостатньо коштів на рахунку " + accountNumber + ". Операція неможлива.");
        }
    }

    public void blockAccount() {
        isBlocked = true;
        System.out.println("Рахунок " + accountNumber + " заблоковано.");
    }

    public void unblockAccount() {
        isBlocked = false;
        System.out.println("Рахунок " + accountNumber + " розблоковано.");
    }
}