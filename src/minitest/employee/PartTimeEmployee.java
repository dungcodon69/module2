package minitest.employee;

public class PartTimeEmployee extends Employee{
    private int workingHour;

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public PartTimeEmployee(int empCode, String name, int age, String phone, String email, int workingHour) {
        super(empCode, name, age, phone, email);
        this.workingHour = workingHour;
    }

    public PartTimeEmployee(int workingHour) {
        this.workingHour = workingHour;
    }

    public PartTimeEmployee() {
    }

    @Override
    protected double salaryCalculate() {
        return workingHour * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + " - PartTimeEmployee{" +
                "workingHour=" + workingHour +
                '}';
    }
}
