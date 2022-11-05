public class CircleArea {
    public double circleArea(double r) {
        if (r < 0) {
            throw new IllegalArgumentException("Ratio can't be negative");
        }

        double area;
        area = Math.PI * Math.exp(r);
        return area;
    }
}
