class Cylinder {
    private double radius;
    private double height;

    // Getters
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    // Surface Area
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    // Volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class cylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.setRadius(3);
        c.setHeight(5);

        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println("Volume: " + c.volume());
    }
}