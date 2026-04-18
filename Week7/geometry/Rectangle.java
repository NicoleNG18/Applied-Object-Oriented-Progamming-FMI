package geometry;

import javafx.scene.Group;

public class Rectangle {

    private Point uPoint;
    private double width;
    private double height;

    public Rectangle(Point uPoint, double height, double width) {
        setHeight(height);
        setWidth(width);
        setUPoint(uPoint);
    }

    public Rectangle() {
        this(new Point(), 1, 2);
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.uPoint, rectangle.height, rectangle.width);
    }

    public Point getUPoint() {
        return new Point(uPoint);
    }

    public void setUPoint(Point uPoint) {
        if (uPoint != null) {
            this.uPoint = new Point(uPoint);
        } else {
            this.uPoint = new Point();
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 1;
    }

    @Override
    public String toString() {
        return String.format("Rectangle{ uPoint: %s, height: %.2f, width: %.2f",
                uPoint.toString(), getHeight(), getWidth());
    }

    public void draw(Group pane) {
        double x=this.uPoint.getCoords()[0];
        double y=this.uPoint.getCoords()[1];
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(x,y,width,height);

        pane.getChildren().add(rectangle);
    }
}
