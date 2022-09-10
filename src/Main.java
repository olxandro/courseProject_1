public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Попов", "Петр", "Петрович", 1, 10000);
        employees[1] = new Employee("Семенов", "Александр", "Петрович", 5, 15000);
        employees[2] = new Employee("Петухов", "Павел", "Семенович", 4, 13000);
        employees[3] = new Employee("Совельев", "Григорий", "Юрьевич", 3, 20000);
        employees[4] = new Employee("Сухоруко", "Василий", "Елисеевич", 2, 14000);
        employees[5] = new Employee("Понов", "Антон", "Петрович", 1, 16000);
        employees[6] = new Employee("Кипрюшин", "Геннадий", "Геннадьевич", 1, 30000);
        employees[7] = new Employee("Соловьева", "София", "Руслвновна", 2, 40000);
        employees[8] = new Employee("Соплин", "Федор", "Илларионович", 3, 60000);
        employees[9] = new Employee("Капушкина", "Ольга", "Михайловна", 4, 100000);

        getListEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц = " + getSumSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + getMinSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + getMaxSalary());
        System.out.println("Среднее значение зарплат - " + getAverageSalary());
        getFIO();

    }

    public static void getListEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int getSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    public static Employee getMinSalary() {
        Employee min = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                min = employee;
            }
        }
        return min;
    }

    public static Employee getMaxSalary() {
        Employee max = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                max = employee;
            }
        }
        return max;
    }

    public static int getAverageSalary() {
        return getSumSalary() / employees.length;
    }

    public static void getFIO() {
        for (Employee employee : employees) {
            System.out.println("ФИО сотрудника " + employee.id + ": " + employee.lastName + " " + employee.firstName + " " + employee.middleName);
        }
    }

}