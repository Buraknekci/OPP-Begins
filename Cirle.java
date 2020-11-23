public class Cirle {
    private double radius;


    public Cirle(double radius) {
        this.radius = 0;
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
