public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Гаррі Потер", "Роулінг", 2001);
        Book book2 = new Book("Lord of the Rings", "Джон Рональд Руэл Толкин", 1954);
        library.addBook(book1);
        library.addBook(book2);
        library.printAllBooks();
        library.removeBook("Гаррі Потер");

        Bank myBank = new Bank();
        BankAccount account1 = myBank.createAccount();
        BankAccount account2 = myBank.createAccount();
        account1.deposit(1000);
        account2.deposit(500);
        account1.transfer(account2, 200);
        account1.withdraw(300);
        myBank.blockAccount(account1.getAccountNumber());
        account1.withdraw(100);
        myBank.unblockAccount(account1.getAccountNumber());
        account1.withdraw(100);
        System.out.println("Інформація про рахунки:");
        System.out.println("Рахунок 1: Залишок - " + account1.getBalance());
        System.out.println("Рахунок 2: Залишок - " + account2.getBalance());

        System.out.println("---------");

        WorkSystem workSystem = new WorkSystem();
        Worker worker1 = new Worker("Іван", 50000.0, "Відділ розробки");
        Worker worker2 = new Worker("Марія", 60000.0, "Відділ тестування");
        workSystem.addWorker(worker1);
        workSystem.addWorker(worker2);
        System.out.println("Інформація про всіх працівників:");
        for (int i = 0; i < workSystem.getNumberOfEmployees(); i++) {
            workSystem.getWorkers()[i].displayInfo();
        }
        System.out.println("Загальна зарплата: " + workSystem.calculateTotalSalary());
        System.out.println("Середня зарплата: " + WorkSystem.calculateAverageSalary(workSystem.getWorkers(), workSystem.getNumberOfEmployees()));
        workSystem.removeWorker("Іван");
        System.out.println("Інформація про всіх працівників після видалення:");
        for (int i = 0; i < workSystem.getNumberOfEmployees(); i++) {
            workSystem.getWorkers()[i].displayInfo();
        }
    }
}