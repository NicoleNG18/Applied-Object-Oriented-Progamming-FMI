package geometry;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Line {
    private Point sPoint;
    private Point ePoint;

    public Line(Point sPoint, Point ePoint) {
        setEPoint(ePoint);
        setSPoint(sPoint);
    }

    public Line() {
        this(new Point(), new Point(new double[]{1, 1}));
    }

    public Line(Line line) {
        this(line.sPoint, line.ePoint);
    }

    public Point getSPoint() {
        return new Point(sPoint);
    }

    public void setSPoint(Point sPoint) {
        this.sPoint = sPoint != null ? new Point(sPoint) : new Point();
    }

    public Point getEPoint() {
        return new Point(ePoint);
    }

    public void setEPoint(Point ePoint) {
        this.ePoint = ePoint != null ? new Point(ePoint) : new Point();
    }

    @Override
    public String toString() {
        return String.format("Line: { sPoint: %s, ePoint: %s}", sPoint.toString(), ePoint.toString());
    }

    public void draw(Group pane) {
        double startX = sPoint.getCoords()[0];
        double startY = sPoint.getCoords()[1];

        double endX = ePoint.getCoords()[0];
        double endY = ePoint.getCoords()[1];

        javafx.scene.shape.Line line = new javafx.scene.shape.Line(startX, startY, endX, endY);
        line.setStroke(Color.RED);
        pane.getChildren().add(line);
    }
}


