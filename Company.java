import employees.Employee;
import employees.Worker;
import employees.Manager;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Jakub Trytytka", 2500, 0);
        employees[1] = new Worker("Anna Maj", 2970, "Tester");
        employees[2] = new Employee("Jakub Musiał", 1000);
        employees[3] = new Employee("Bark Peppermint", 3000);
        employees[4] = new Worker("Natasza Tulipan", 2900, "Sekretarka");
        employees[5] = new Worker("Bartolomeo Monaco", 3000, "MobileDeveloper");
        employees[6] = new Manager("Liste Ring-Luck", 4000, 3);

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(3);
                employee.setSalary(75000);
            }
        }
        System.out.println("Zaktualizowane dane pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
      }
}