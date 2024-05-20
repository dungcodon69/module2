package minitest.employee;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double forfeit;
    private double salary;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getForfeit() {
        return forfeit;
    }

    public void setForfeit(double forfeit) {
        this.forfeit = forfeit;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(int empCode, String name, int age, String phone, String email, double bonus, double forfeit, double salary) {
        super(empCode, name, age, phone, email);
        this.bonus = bonus;
        this.forfeit = forfeit;
        this.salary = salary;
    }

    public FullTimeEmployee(double bonus, double forfeit, double salary) {
        this.bonus = bonus;
        this.forfeit = forfeit;
        this.salary = salary;
    }

    public FullTimeEmployee() {
    }

    @Override
    protected double salaryCalculate() {
        return salary + (bonus - forfeit);
    }

    @Override
    public String toString() {
        return super.toString() + " - FullTimeEmployee{" +
                "bonus=" + bonus +
                ", forfeit=" + forfeit +
                ", salary=" + salary +
                ", total-salary= " + salaryCalculate() +
                '}';
    }
}
