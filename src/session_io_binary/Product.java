package session_io_binary;

import java.io.Serializable;

public class Product implements Serializable {
    int code;
    String name;
    double price;
    String brand;
    String description;

    public Product() {
    }

    public Product(int code, String name, double price, String brand, String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
