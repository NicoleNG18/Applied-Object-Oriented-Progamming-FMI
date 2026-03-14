package compexNumbers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ComplexNumberTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 400, 400);

        double z1Real = getInput("Enter Real(z1):");
        double z1Img = getInput("Enter Imaginary(z1):");
        double z2Real = getInput("Enter Real(z2):");
        double z2Img = getInput("Enter Imaginary(z2):");

        ComplexNumber z1 = new ComplexNumber(z1Real, z1Img);
        ComplexNumber z2 = new ComplexNumber(z2Real, z2Img);

        ComplexNumber sum = z1.add(z2);

        double centerX = scene.getWidth() / 2;
        double centerY = scene.getHeight() / 2;
        double scale = 20;

        drawAxes(group, centerX, centerY, scene.getWidth(), scene.getHeight());

        double endX = centerX + (sum.getRealPart() * scale);
        double endY = centerY - (sum.getImaginaryPart() * scale);

        Line vectorLine = new Line(centerX, centerY, endX, endY);
        vectorLine.setStroke(Color.BLUE);
        vectorLine.setStrokeWidth(3);

        Text label = new Text(endX + 5, endY - 5,
                String.format("Sum: %.1f + %.1fi\nr=%.2f, θ=%.2f rad",
                        sum.getRealPart(), sum.getImaginaryPart(), sum.getMagnitude(), sum.getAngle()));

        group.getChildren().addAll(vectorLine, label);

        stage.setTitle("Complex Number Visualization");
        stage.setScene(scene);
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.show();
    }

    static void main() {
        launch();
    }

    private void drawAxes(Group group, double cx, double cy, double w, double h) {
        Line xAxis = new Line(0, cy, w, cy);
        Line yAxis = new Line(cx, 0, cx, h);
        xAxis.setStroke(Color.LIGHTGRAY);
        yAxis.setStroke(Color.LIGHTGRAY);

        group.getChildren().addAll(xAxis, yAxis);
        group.getChildren().add(new Text(w - 20, cy - 5, "Re"));
        group.getChildren().add(new Text(cx + 5, 15, "Im"));
    }

    private double getInput(String prompt) {
        TextInputDialog tid = new TextInputDialog();
        tid.setHeaderText(null);
        tid.setTitle("Input");
        tid.setContentText(prompt);
        return Double.parseDouble(tid.showAndWait().get());
    }
}