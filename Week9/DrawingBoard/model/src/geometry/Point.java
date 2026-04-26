package geometry;

public class Point {
    private int[] coords;

    public Point() {
        this(new int[2]);
    }

    public Point(Point point) {
        this(point.coords);
    }

    public Point(int[] coords) {
        setCoords(coords);
    }

    public int[] getCoords() {
        int[] copy = new int[coords.length];

        System.arraycopy(coords, 0, copy, 0, coords.length);

        return copy;
    }

    public void setCoords(int[] coords) {

        if (coords != null && coords.length == 2) {
            int[] copy = new int[coords.length];

            for (int i = 0; i < coords.length; i++) {
                copy[i] = coords[i];
            }

            this.coords = copy;
        } else {
            this.coords = new int[2];
        }
    }

    public void setPoint(Point point) {
        setCoords(point.coords);
    }

    public Point getPoint() {
        return new Point(this);
    }

    @Override
    public String toString() {
        return String.format("(%.d;%.d", coords[0], coords[1]);
    }

}

