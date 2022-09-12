import javax.annotation.processing.Generated;

public class Employee {

    final private int id;
    private static int count = 0;
    final private String lastName;
    final private String firstName;
    final private String middleName;
    private int department;
    private int salary;


    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        id = ++count;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
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
                "id: " + id +
                ", lastName: '" + lastName +
                ", firstName: '" + firstName +
                ", middleName: '" + middleName +
                ", department: " + department +
                ", salary: " + salary;
    }

}

