package minitest.employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new PartTimeEmployee(1,"Dung",23,"0701111111","dungna.qn@gmail.com",150);
        employees[1] = new FullTimeEmployee(2,"Full-time-Test1",21,"0701111112","test1@gmail.com",200000,50000,5000000);
        employees[2] = new FullTimeEmployee(3,"Full-time-Test2",21,"0701111112","test1@gmail.com",190000,50000,5000000);
        employees[3] = new FullTimeEmployee(4,"Full-time-Test3",21,"0701111112","test1@gmail.com",100000,50000,5000000);
        employees[4] = new FullTimeEmployee(5,"Full-time-Test4",21,"0701111112","test1@gmail.com",150000,50000,5000000);
        employees[5] = new PartTimeEmployee(6,"Part-time-Test5",22,"0701111113","test2@gmail.com",150);

        double avg = avgSalaryOfEmployees(employees);
        System.out.println("Average salary of all employees: " + avg);
        System.out.println("Full-time employees have the salary less than average: ");
        displayFullTimeEmployeeHaveSalaryLessThanAvg(avg,employees);
        System.out.print("The total salary must pay to Part-time employees: ");
        payPartTimeEmployee(employees);
        System.out.println("Sort the full-time employees by salary ascending: ");
        sortEmployeesBySalaryAsc(employees);
    }

    private static void sortEmployeesBySalaryAsc(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee temp = employees[0];
            if (employees[i] instanceof FullTimeEmployee){
                for (int j = i + 1; j < employees.length ; j++) {
                    if (employees[i].salaryCalculate() > employees[j].salaryCalculate()){
                        temp = employees[j];
                        employees[j] = employees[i];
                        employees[i] = temp;
                    }
                }
            }
        }

        for (Employee emp :
                employees) {
            if (emp instanceof FullTimeEmployee) {
                System.out.println(emp);
                }
            }
    }

    private static void payPartTimeEmployee(Employee[] employees) {
        double total = 0;
        for (Employee emp :
                employees) {
            if (emp instanceof PartTimeEmployee){
                total += emp.salaryCalculate();
            }
        }
        System.out.printf("%f%n",total);
    }

    private static void displayFullTimeEmployeeHaveSalaryLessThanAvg(double avg,Employee[] employees) {
        Employee[] newEmployees = new Employee[employees.length];
        int idx = 0;
        for (Employee emp :
                employees) {
            if (emp instanceof FullTimeEmployee && emp.salaryCalculate() < avg) {
                newEmployees[idx] = emp;
                idx++;
            }
        }
        for (Employee emp :
                newEmployees) {
            if (emp == null) continue;
            System.out.println(emp);
        }
    }

    private static double avgSalaryOfEmployees(Employee[] employees) {
        double avg = 0;
        for (Employee emp :
                employees) {
            avg += emp.salaryCalculate();
        }
        return avg / employees.length;
    }
}
