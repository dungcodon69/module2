package minitest.material;

import java.time.LocalDate;

public class Meat extends Material{
    double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    @Override
    protected double getAmount() {
        return weight * cost;
    }

    @Override
    protected LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
