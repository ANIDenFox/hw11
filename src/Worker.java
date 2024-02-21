public class Worker {
    private String name;
    private double salary;
    private String department;

    public Worker(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Зарплата: " + salary);
        System.out.println("Відділ: " + department);
        System.out.println("------------");
    }
}

