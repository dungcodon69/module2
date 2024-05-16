package session_inheritance.exercise.circleandcylinder;

public class Cylinder extends Circle{
    private double height;



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(){
        height = 2.0;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + getVolume() +
                '}';
    }
}
