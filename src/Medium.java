public class Medium {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

    }

    public static void incrimentSalary(int persent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int)(currentSalary * (persent / 100f + 1)));
        }
    }

    public static Employee findMinSalaryEmployeeOfTeam(int numberTeam) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != numberTeam) {
                    continue;
                }
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public static Employee findMaxSalaryEmployeeOfTeam(int numberTeam) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != numberTeam) {
                    continue;
                }
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public static int calculateTotalSalaryOfTeam(int teamNumber) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static float calculateAverageSalaryOfTeam(int teamNumber) {
        int count = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                 sum += employee.getSalary();
                 count++;
            }
        }
        return sum / (float) count;
    }

    public static void increaseSalaryOfTeam(int teamNumber, int persent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (persent / 100f + 1)));
            }
        }
    }

    public static void printTeam(int teamNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithLessSalaryThan(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithMoreSalaryThan(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee);
            }
        }
    }
}
