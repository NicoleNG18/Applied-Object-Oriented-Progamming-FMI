package com.geometry.types;

public class Cylinder extends Circle {
    int height;

    public Cylinder(int x, int y, int radius, int height) {
        super(x, y, radius);
        setHeight(height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height > 0 ? height : 1;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        }

        if (!(o instanceof Cylinder cylinder)) {
            return 1;
        }

        int resultByCircle = super.compareTo(o);

        if (resultByCircle != 0) {
            return resultByCircle;
        }

        return this.height - cylinder.height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder %s, height: ",super.toString(),height);
    }
}
