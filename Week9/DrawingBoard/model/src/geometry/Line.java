package geometry;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Line extends Point {
    private Point ePoint;

    public Line(Point sPoint, Point ePoint) {
        setEPoint(ePoint);
        setSPoint(sPoint);
    }

    public Line() {
        this(new Point(), new Point(new int[]{1, 1}));
    }

    public Line(Line line) {
        this(line.getSPoint(), line.ePoint);
    }

    public Point getSPoint() {
        return getPoint();
    }

    public void setSPoint(Point sPoint) {
        setPoint(sPoint);
    }

    public Point getEPoint() {
        return new Point(ePoint);
    }

    public void setEPoint(Point ePoint) {
        this.ePoint = ePoint != null ? new Point(ePoint) : new Point();
    }

    @Override
    public String toString() {
        return String.format("Line: { sPoint: %s, ePoint: %s}", getPoint(), ePoint.toString());
    }

    public double measure() {

        Point sPoint = getSPoint();
        int startX = sPoint.getCoords()[0];
        int startY = sPoint.getCoords()[1];

        Point ePoint = getEPoint();
        int endX = sPoint.getCoords()[0];
        int endY = sPoint.getCoords()[1];

        return Math.sqrt((endX - startX) * (endX - startX) + (endY - startY) * (endY - startY));
    }

    public void draw(Pane pane) {
        Point sPoint = getSPoint();
        double startX = sPoint.getCoords()[0];
        double startY = sPoint.getCoords()[1];

        double endX = ePoint.getCoords()[0];
        double endY = ePoint.getCoords()[1];

        javafx.scene.shape.Line line = new javafx.scene.shape.Line(startX, startY, endX, endY);
        line.setStroke(Color.RED);
        pane.getChildren().add(line);
    }
}



