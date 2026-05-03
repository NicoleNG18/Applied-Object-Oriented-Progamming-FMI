package com.geometry.types;

public class Circle extends Point {
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius > 0 ? radius : 1;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        }

        if (!(o instanceof Circle circle)) {
            return 1;
        }

        int resultByCenter = super.compareTo(o);

        if (resultByCenter != 0) {
            return resultByCenter;
        }

        return this.radius - circle.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: %s, radius: %s" ,super.toString(),radius);
    }
}
