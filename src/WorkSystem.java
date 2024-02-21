public class WorkSystem {
    private Worker[] workers;
    private int numberOfEmployees;

    public WorkSystem() {
        this.workers = new Worker[10]; // Фіксований розмір масиву
        this.numberOfEmployees = 0;
    }

    public void addWorker(Worker worker) {
        if (numberOfEmployees < workers.length) {
            workers[numberOfEmployees] = worker;
            numberOfEmployees++;
            System.out.println("Новий працівник доданий:");
            worker.displayInfo();
        } else {
            System.out.println("Досягнуто максимальну кількість працівників. Додавання неможливе.");
        }
    }

    public void removeWorker(String workerName) {
        for (int i = 0; i < numberOfEmployees; i++) {
            if (workers[i].getName().equals(workerName)) {
                System.out.println("Працівник " + workerName + " видалений.");
                workers[i] = null;
                rearrangeWorkers(i);
                numberOfEmployees--;
                return;
            }
        }
        System.out.println("Працівник з іменем " + workerName + " не знайдений.");
    }

    private void rearrangeWorkers(int index) {
        for (int i = index; i < numberOfEmployees - 1; i++) {
            workers[i] = workers[i + 1];
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            totalSalary += workers[i].getSalary();
        }
        return totalSalary;
    }

    public static double calculateAverageSalary(Worker[] workers, int numberOfEmployees) {
        double totalSalary = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            totalSalary += workers[i].getSalary();
        }
        return numberOfEmployees > 0 ? totalSalary / numberOfEmployees : 0;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}