public class Bank {
    private BankAccount[] accounts;
    private int numberOfAccounts;

    public Bank() {
        accounts = new BankAccount[100];
        numberOfAccounts = 0;
    }

    public BankAccount createAccount() {
        BankAccount newAccount = new BankAccount("ACC" + (numberOfAccounts + 1));
        accounts[numberOfAccounts] = newAccount;
        numberOfAccounts++;
        System.out.println("Створено новий банківський рахунок: " + newAccount.getAccountNumber());
        return newAccount;
    }

    public void blockAccount(String accountNumber) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].blockAccount();
                return;
            }
        }
        System.out.println("Банківський рахунок з номером " + accountNumber + " не знайдено.");
    }

    public void unblockAccount(String accountNumber) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].unblockAccount();
                return;
            }
        }
        System.out.println("Банківський рахунок з номером " + accountNumber + " не знайдено.");
    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        System.out.println("Банківський рахунок з номером " + accountNumber + " не знайдено.");
        return null;
    }
}