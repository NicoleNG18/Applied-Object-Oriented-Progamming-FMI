package problem2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class CaesarSceneApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root
                = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CipherScene.fxml")));

        Scene scene = new Scene(root);

        stage.setTitle("App Encryption");
        stage.sizeToScene();
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();
    }

    static void main() {
        launch();
    }
}