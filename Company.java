import employees.Employee;
import employees.Worker;
import employees.Manager;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Jakub Trytytka", 2500, 0);
        employees[1] = new Worker("Anna Maj", 2970, "Tester");
        employees[2] = new Employee("Jakub Musiał", 1000);
        employees[3] = new Employee("Bark Peppermint", 3000);
        employees[4] = new Worker("Natasza Tulipan", 2900, "Sekretarka");

        int nonManagerEmployeeCount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagerEmployeeCount++;
            }
        }
        ((Manager)employees[0]).setNumberOfSubordinates(nonManagerEmployeeCount);
        employees[0].setSalary(7500);
        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}