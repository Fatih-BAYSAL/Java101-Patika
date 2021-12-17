package SalaryCalculator;

public class Main {
    public static void main(String[] args) {

        Employee worker = new Employee("Fatih", 2000, 45, 1985);
        worker.tax();
        worker.bonus();
        worker.raiseSalary();
        worker.printInfo();

    }
}
