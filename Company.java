public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jakub Trytytka", 2500);
        employees[1] = new Employee("Anna Maj", 2970);
        employees[2] = new Employee("Jakub Musiał", 1000);
        employees[3] = new Employee("Bark Peppermint", 3000);
        employees[4] = new Employee("Natasza Tulipan", 2900);

        System.out.println("Pracownika o indeksie 3:");
        System.out.println(employees[3]);

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}