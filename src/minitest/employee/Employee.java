package minitest.employee;

public abstract class Employee {
    private int empCode;
    private String name;
    private int age;
    private String phone;
    private String email;

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(int empCode, String name, int age, String phone, String email) {
        this.empCode = empCode;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Employee() {

    }

    protected abstract double salaryCalculate();

    @Override
    public String toString() {
        return "Employee{" +
                "empCode=" + empCode +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
