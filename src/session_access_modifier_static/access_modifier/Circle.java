package session_access_modifier_static.access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        color = "red";
    }
    protected double getRadius(){
        return radius;
    }
    protected double getArea(){
        return radius * radius * 3.14;
    }

}
