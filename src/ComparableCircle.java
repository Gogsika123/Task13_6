public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle other) {
        // fartobebit shedareba
        double thisArea = this.getArea();
        double otherArea = other.getArea();

        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }
    public static ComparableCircle findLarger(ComparableCircle circle1, ComparableCircle circle2) {
        return circle1.compareTo(circle2) > 0 ? circle1 : circle2;
    }
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5.0);
        ComparableCircle circle2 = new ComparableCircle(3.0);
        ComparableCircle largerCircle = ComparableCircle.findLarger(circle1, circle2);
        System.out.println("Larger circle: Radius = " + largerCircle.getRadius());
    }
}
