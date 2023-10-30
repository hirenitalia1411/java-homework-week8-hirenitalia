package p_20_pool_area;

public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double width, double length, double height) {
        super(width,length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}