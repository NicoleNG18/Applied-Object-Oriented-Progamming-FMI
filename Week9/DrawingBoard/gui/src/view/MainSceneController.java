package view;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MainSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDrawLine;

    @FXML
    private Button btnDrawrRectangle;

    @FXML
    private Pane pnlDrawingBoard;

    private Random random;

    @FXML
    void btnDrawLineOnAction(ActionEvent event) {
        Point[] points = getStartAndEndPoints();

        Line line = new Line(points[0], points[1]);
        line.draw(pnlDrawingBoard);
    }

    @FXML
    void btnDrawRectangleOnAction(ActionEvent event) {
        Point[] points = getStartAndEndPoints();

        Rectangle rectangle = new Rectangle(points[0], points[1]);
        rectangle.draw(pnlDrawingBoard);
    }

    @FXML
    void initialize() {
        assert btnDrawLine != null : "fx:id=\"btnDrawLine\" was not injected: check your FXML file 'MainScene.fxml'.";
        assert btnDrawrRectangle != null : "fx:id=\"btnDrawRectangle\" was not injected: check your FXML file 'MainScene.fxml'.";
        assert pnlDrawingBoard != null : "fx:id=\"pnlDrawingBoard\" was not injected: check your FXML file 'MainScene.fxml'.";

        random = new Random();
    }

    private Point[] getStartAndEndPoints() {
        double width = pnlDrawingBoard.getWidth();
        double height = pnlDrawingBoard.getHeight();

        int upperX = (int) random.nextDouble(width);
        int upperY = (int) random.nextDouble(height);
        int lowerX = (int) random.nextDouble(width);
        int lowerY = (int) random.nextDouble(height);

        int finalUpperX = Math.min(upperX, lowerX);
        int finalLowerX = Math.max(upperX, lowerX);
        int finalUpperY = Math.min(upperY, lowerY);
        int finalLowerY = Math.max(upperY, lowerY);

        Point sPoint = new Point(new int[]{finalUpperX, finalUpperY});
        Point ePoint = new Point(new int[]{finalLowerX, finalLowerY});

        return new Point[]{sPoint, ePoint};
    }
}
