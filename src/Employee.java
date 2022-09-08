import javax.annotation.processing.Generated;

public class Employee {

    int id;
    String lastName;
    String firstName;
    String middleName;
    int department;
    int salary;


    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public getSumSalary() {
        for (int i = 0; i < ; i++) {

        }
    }

    int minSalary = 0;
    public minSalary() {
        for (int i = 0; i < ; i++) {

        }

    }

    public maxSalary() {
        for (int i = 0; i < ; i++) {

        }
    }
}

