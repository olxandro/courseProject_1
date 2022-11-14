public class EmployeeBook {

    private Employee[] employees = new Employee[10];

    public void addEmployee (Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i] = employee;
            }

        }
    }

    public Employee findEmployee(String firstName, String lastName, String middleName) {
        for (Employee employee : employees) {
            if (employee != null
                    && employee.getFirstName().equals(firstName)
                    && employee.getLastName().equals(lastName)
                    && employee.getMiddleName().equals(middleName)) {
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployee(String firstName, String lastName, String middleName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null
            && employees[i].getFirstName().equals(firstName)
            && employees[i].getLastName().equals(lastName)
            && employees[i].getMiddleName().equals(middleName)) {
                employees[i] = null;
            }
        }
    }

    public void changeEmployee(String firstName, String lastName, String middleName, int salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null
                    && employees[i].getFirstName().equals(firstName)
                    && employees[i].getLastName().equals(lastName)
                    && employees[i].getMiddleName().equals(middleName)) {
                employees[i] = null;
            }
        }
    }

    public void printTeam(int teamNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                System.out.println(employee);
            }
        }
    }
}
