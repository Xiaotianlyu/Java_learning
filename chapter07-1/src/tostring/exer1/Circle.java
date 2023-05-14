package tostring.exer1;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        color = "white";
        weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
        color = "white";
        weight = 1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //圆的面积
    public double findArea() {
        return 3.14 * radius * radius;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Circle) {
            return ((Circle) obj).radius == this.radius;
        }
        return false;
    }
    public String tostring(){
        return "Circle[radius = " + radius + "]";
    }
}
