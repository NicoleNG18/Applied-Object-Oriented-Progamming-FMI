package geometry;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Geometry extends Application {

    @Override
    public void start(javafx.stage.Stage primaryStage) {
        Group group = new javafx.scene.Group();
        Scene scene = new javafx.scene.Scene(group, 300, 250);

        double width = scene.getWidth();
        double height = scene.getHeight();

        double centerX = width / 2;
        double centerY = height / 2;
        double radius = Math.min(width, height) / 3;

        Circle circle = new Circle(centerX, centerY, radius);
        circle.setFill(null);
        circle.setStroke(Color.BLUE);

        double lineX = getLineX(width);
        Line line = new Line(lineX, 0, lineX, height);
        line.setStroke(Color.RED);

        group.getChildren().add(circle);
        group.getChildren().add(line);

        double oh = centerX - lineX;
        double chSquare = Math.pow(radius, 2) - Math.pow(oh, 2);

        if (chSquare < 0) {
            showWarning();
            Platform.exit();
            return;
        } else {
            double intersectionPointOneY = centerY - Math.sqrt(chSquare);
            drawIntersectionPoint(lineX, intersectionPointOneY, group);

            if (chSquare > 0) {
                double intersectionPointTwoY = centerY + Math.sqrt(chSquare);
                drawIntersectionPoint(lineX, intersectionPointTwoY, group);
            }
        }

        primaryStage.setTitle("Geometry");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    static void main() {
        launch();
    }

    private void drawIntersectionPoint(double x, double y, Group group) {
        Circle circle = new Circle(x, y, 3);
        Text text = new Text(x + 20, y, String.format("x: %.2f, y: %.2f", x, y));
        group.getChildren().add(circle);
        group.getChildren().add(text);
    }

    private void showWarning() {
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle("Warning");
        alert.setContentText("There are no intersection points");
        alert.showAndWait();
    }

    private double getLineX(double sceneWidth) {
        TextInputDialog tid = new TextInputDialog();
        tid.setTitle("Prompt");
        tid.setHeaderText(null);
        tid.setContentText("Enter x:");

        double input = -1;
        do {

            input = Double.parseDouble(tid.showAndWait().get());

            if(input < 0 || input > sceneWidth){
                showError(input);
            }
        } while (input < 0 || input > sceneWidth);

        return input;
    }

    private void showError(double input) {
        Alert alert = new Alert(Alert.AlertType.ERROR);

        alert.setTitle("Error");
        alert.setContentText(String.format("X must be in the following interval [0,%.2f]",input));
        alert.showAndWait();
    }

}
