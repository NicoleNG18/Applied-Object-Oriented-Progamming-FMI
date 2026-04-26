package geometry;

import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class Rectangle extends Point {

    private Point lPoint;

    public Rectangle(Point uPoint, Point lPoint) {
        setUPoint(uPoint);
        setLPoint(lPoint);
    }

    public Rectangle() {
        this(new Point(), new Point(new int[]{1, 2}));
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getUPoint(), rectangle.lPoint);
    }

    public Point getUPoint() {
        return getPoint();
    }

    public Point getLPoint() {
        return getPoint();
    }

    public void setUPoint(Point uPoint) {
        setPoint(uPoint);
    }

    public void setLPoint(Point lPoint) {
        setPoint(lPoint);
    }

    public int getWidth() {
        return Math.abs(getUPoint().getCoords()[0] - lPoint.getCoords()[0]);
    }

    public int getHeight() {
        return Math.abs(getUPoint().getCoords()[1] - lPoint.getCoords()[1]);
    }

    @Override
    public String toString() {
        return String.format("Rectangle{ uPoint: %s, lPoint: %s",
                getUPoint(), lPoint);
    }

    public void draw(Pane pane) {
        Point uPoint = getUPoint();
        int x = uPoint.getCoords()[0];
        int y = uPoint.getCoords()[1];
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(x, y, getWidth(), getHeight());

        pane.getChildren().add(rectangle);
    }

    public int measure() {
        return 2 * (getHeight() + getHeight());
    }
}

