package task6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawTask6 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene scene = new Scene(group, 400, 400);

        drawFigureA(group, scene.getWidth(), scene.getHeight(), 15);
        //drawFigureB(group, scene.getWidth(), scene.getHeight(), 15);

        primaryStage.setTitle("Drawing shapes - Figures A & B");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawFigureA(Group group, double width, double height, int steps) {
        double xStep = width / steps;
        double yStep = height / steps;

        for (int i = 0; i < steps; i++) {
            Line line = new Line(0, i * yStep, (i + 1) * xStep, height);
            line.setStroke(Color.ORANGE);
            group.getChildren().add(line);
        }
    }

    private void drawFigureB(Group group, double width, double height, int steps) {
        double xStep = width / steps;
        double yStep = height / steps;

        for (int i = 0; i < steps; i++) {
            double currentY = i * yStep;
            double nextX = (i + 1) * xStep;

            addLine(group, 0, currentY, nextX, height);
            addLine(group, 0, height - currentY, nextX, 0);
            addLine(group, width, currentY, width - nextX, height);
            addLine(group, width, height - currentY, width - nextX, 0);
        }
    }

    private void addLine(Group group, double x1, double y1, double x2, double y2) {
        Line line = new Line(x1, y1, x2, y2);
        line.setStroke(Color.ORANGE);
        group.getChildren().add(line);
    }

     static void main() {
        launch();
    }
}