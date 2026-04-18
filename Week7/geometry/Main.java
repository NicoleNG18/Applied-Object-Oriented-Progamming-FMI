package geometry;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 250);

        stage.setTitle("Geometry");
        stage.sizeToScene();
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();

        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            double x = random.nextInt(20, 250);
            double y = random.nextInt(20, 200);

            Point uPoint = new Point(new double[]{x, y});
            double width = random.nextDouble(20, 50);
            double height = random.nextDouble(20, 50);

            Rectangle rectangle = new Rectangle(uPoint, height, width);
            Line diagOne = new Line(uPoint, new Point(new double[]{x + width, y + height}));
            Line diagTwo = new Line(new Point(new double[]{x + width, y}), new Point(new double[]{x, y + height}));
            rectangle.draw(group);
            diagOne.draw(group);
            diagTwo.draw(group);
        }

    }
}

