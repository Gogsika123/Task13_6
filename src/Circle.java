public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }


    protected double getArea() {
        return radius * radius * Math.PI;
    }

}
