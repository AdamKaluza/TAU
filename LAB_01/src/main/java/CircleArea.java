public class CircleArea {
    private static final double PI = 3.14;

    public double circleArea(double r) {
        double area;
        area = CircleArea.PI * Math.exp(r);
        return area;
    }
}
