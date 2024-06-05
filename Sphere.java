public class Sphere implements Shape{

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }
}
